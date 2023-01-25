package javaalgo.haulzzang.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj21937 {

    static int N, M, X, cnt = 0;
    static List<List<Integer>> adj;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new ArrayList<>();
        visited = new boolean[N + 1];
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj.get(y).add(x);
        }
        X = Integer.parseInt(br.readLine());

        dfs(X);

        System.out.println(cnt);
    }

    static void dfs(int x) {
        visited[x] = true;

        for (int y : adj.get(x)) {
            if (!visited[y]) {
                cnt++;
                visited[y] = true;
                dfs(y);
            }
        }
    }
}
