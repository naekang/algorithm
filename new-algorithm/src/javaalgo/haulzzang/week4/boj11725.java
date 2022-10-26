package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class boj11725 {

    static int N;
    static List<Integer>[] adj;
    static boolean[] visited;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println(sb.toString());
    }

    static void solution() {
        dfs(1);

        for (int i = 2; i <= N; i++) {
            sb.append(answer[i]).append('\n');
        }
    }

    static void dfs(int start) {
        visited[start] = true;

        for (int y : adj[start]) {
            if (!visited[y]) {
                answer[y] = start;
                dfs(y);
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[N + 1];
        answer = new int[N + 1];

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }

    }
}
