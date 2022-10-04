package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1260 {

    static int N, M, V;
    static List<Integer>[] adj;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();

        dfs(V);

        init();

        bfs(V);
        System.out.println(sb.toString());
    }

    private static void init() {
        sb.append('\n');
        visited = new boolean[N + 1];
    }

    static void dfs(int x) {
        visited[x] = true;
        sb.append(x).append(' ');

        for (int y : adj[x]) {
            if (!visited[y]) {
                dfs(y);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            sb.append(x).append(' ');
            for (int y : adj[x]) {
                if (!visited[y]) {
                    queue.add(y);
                    visited[y] = true;
                }
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

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
    }
}
