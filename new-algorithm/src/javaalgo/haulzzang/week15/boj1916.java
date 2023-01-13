package javaalgo.haulzzang.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1916 {

    static final int INF = Integer.MAX_VALUE;
    static int N, M;
    static int[] dist;
    static List<List<Node>> adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        adj = new ArrayList<>();
        dist = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        Arrays.fill(dist, INF);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            adj.get(start).add(new Node(end, weight));
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        dijkstra(x);

        System.out.println(dist[y]);
    }

    static void dijkstra(int start) {
        boolean[] visited = new boolean[N + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            start = pq.poll().idx;

            if (!visited[start]) {
                visited[start] = true;
                for (Node node : adj.get(start)) {
                    if (!visited[node.idx] && dist[node.idx] > dist[start] + node.weight) {
                        dist[node.idx] = dist[start] + node.weight;
                        pq.add(new Node(node.idx, dist[node.idx]));
                    }
                }

            }
        }
    }

    static class Node implements Comparable<Node> {
        int idx;
        int weight;

        public Node(int idx, int weight) {
            this.idx = idx;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }
}


