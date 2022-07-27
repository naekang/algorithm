package javaalgo.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj24444 {

    static int N, M, R, idx = 1;
    static ArrayList<Integer>[] adj;
    static int[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i]);
        }

        bfs(R);

        for (int i = 1; i <= N; i++) {
            sb.append(visited[i]).append('\n');
        }

        System.out.println(sb);

    }

    static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        visited[x] = idx++;
        queue.add(x);

        while (!queue.isEmpty()) {
            x = queue.poll();
            for (int y : adj[x]) {
                if (visited[y] == 0) {
                    queue.add(y);
                    visited[y] = idx++;
                }
            }
        }
    }
}
