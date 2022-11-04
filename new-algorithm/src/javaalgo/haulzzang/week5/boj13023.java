package javaalgo.haulzzang.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj13023 {

    static int N, M, ans;
    static boolean[] visited;
    static List<Integer>[] adj;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {
        for (int i = 0; i < N; i++) {
            if (ans == 1) return 1;

            visited[i] = true;
            dfs(i, 1);
            visited[i] = false;
        }

        return 0;
    }

    static void dfs(int start, int depth) {
        if (depth == 5) {
            ans = 1;
            return;
        }

        visited[start] = true;

        for (int y : adj[start]) {
            if (!visited[y]) {
                visited[y] = true;
                dfs(y, depth + 1);
                visited[y] = false;
            }
        }
    }


    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }
    }
}
