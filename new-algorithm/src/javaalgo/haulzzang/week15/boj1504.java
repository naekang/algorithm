package javaalgo.haulzzang.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1504 {

    static final int INF = 200_000_000;
    static int N, E;
    static int[] dist;
    static List<List<Node>> adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>();
        dist = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            adj.get(start).add(new Node(end, weight));
            adj.get(end).add(new Node(start, weight));
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int distance1 = 0;
        distance1 += dijkstra(1, y);
        distance1 += dijkstra(y, x);
        distance1 += dijkstra(x, N);

        int distance2 = 0;
        distance2 += dijkstra(1, x);
        distance2 += dijkstra(x, y);
        distance2 += dijkstra(y, N);

        int ans = (distance1 >= INF && distance2 >= INF) ? -1 : Math.min(distance1, distance2);

        System.out.println(ans);
    }

    static int dijkstra(int start, int end) {
        Arrays.fill(dist, INF);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N + 1];
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            start = pq.poll().end;

            if (!visited[start]) {
                visited[start] = true;

                for (Node node : adj.get(start)) {
                    if (!visited[node.end] && dist[node.end] > dist[start] + node.weight) {
                        dist[node.end] = dist[start] + node.weight;
                        pq.add(new Node(node.end, dist[node.end]));
                    }
                }
            }
        }

        return dist[end];
    }

    static class Node implements Comparable<Node> {

        int end;
        int weight;

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }

}
