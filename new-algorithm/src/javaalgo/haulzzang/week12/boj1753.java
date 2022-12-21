package javaalgo.haulzzang.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1753 {

    static final int INF = Integer.MAX_VALUE;
    static int V, E, K;
    static List<Edge>[] edges;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        edges = new ArrayList[V + 1];
        dist = new int[V + 1];

        Arrays.fill(dist, INF);

        for (int i = 1; i <= V; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edges[start].add(new Edge(end, weight));
        }

        dijkstra(K);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < dist.length; i++) {
            int dis = dist[i];
            if (dis == INF) {
                sb.append("INF").append('\n');
            } else {
                sb.append(dis).append('\n');
            }
        }

        System.out.println(sb.toString());
    }

    static void dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] check = new boolean[V + 1];
        pq.add(new Edge(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            start = cur.end;

            if (!check[start]) {
                for (Edge edge : edges[start]) {
                    if (dist[edge.end] > dist[start] + edge.weight) {
                        dist[edge.end] = dist[start] + edge.weight;
                        pq.add(new Edge(edge.end, dist[edge.end]));
                    }
                }
            }
        }
    }

}

class Edge implements Comparable<Edge> {

    int end;
    int weight;

    Edge(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}
