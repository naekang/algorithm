package javaalgo.haulzzang.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj9466 {

    static int T, N, cnt;
    static int[] map;
    static boolean[] visited;
    static boolean[] finished;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            cnt = 0;
            map = new int[N + 1];
            visited = new boolean[N + 1];
            finished = new boolean[N + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                map[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= N; i++) {
                if (!finished[i]) {
                    dfs(i);
                }
            }
            sb.append(N - cnt).append('\n');
        }

        System.out.println(sb.toString());
    }

    static void dfs(int start) {
        if (finished[start]) {
            return;
        }
        if (visited[start]) {
            finished[start] = true;
            cnt++;
        }

        visited[start] = true;
        dfs(map[start]);
        finished[start] = true;
        visited[start] = false;
    }

}
