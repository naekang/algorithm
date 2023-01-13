package javaalgo.haulzzang.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1238 {

    private static final int INF = Integer.MAX_VALUE;
    static int N, M, X;
    static List<List<Node>> adj, reverseAdj;
    static int[] dist, reverseDist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        adj = new ArrayList<>();
        reverseAdj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
            reverseAdj.add(new ArrayList<>());
        }

        dist = new int[N + 1];
        reverseDist = new int[N + 1];
        Arrays.fill(dist, INF);
        Arrays.fill(reverseDist, INF);

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            adj.get(start).add(new Node(end, weight));
            reverseAdj.get(end).add(new Node(start, weight));
        }

        dijkstra(adj, dist, X);
        dijkstra(reverseAdj, reverseDist, X);

        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            ans = Math.max(ans, dist[i] + reverseDist[i]);
        }

        System.out.println(ans);
    }

    static void dijkstra(List<List<Node>> list, int[] distance, int start) {
        boolean[] visited = new boolean[N + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        distance[start] = 0;

        while (!pq.isEmpty()) {
            start = pq.poll().idx;

            if (!visited[start]) {
                for (Node node : list.get(start)) {
                    if (distance[node.idx] > distance[start] + node.weight) {
                        distance[node.idx] = distance[start] + node.weight;
                        pq.add(new Node(node.idx, distance[node.idx]));
                    }
                }
            }
        }
    }
}

class Node implements Comparable<Node> {

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
