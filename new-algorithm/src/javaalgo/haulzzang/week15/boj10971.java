package javaalgo.haulzzang.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10971 {

    static int N;
    static int[][] map;
    static boolean[] visited;
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            visited[i] = true;
            dfs(i, i, 0, 0);
        }

        System.out.println(ans);

    }

    static void dfs(int start, int now, int sum, int cnt) {
        if (cnt == N - 1) {
            if (map[now][start] != 0) {
                sum += map[now][start];
                ans = Math.min(ans, sum);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && map[now][i] != 0) {
                visited[i] = true;
                dfs(start, i, sum + map[now][i], cnt + 1);
                visited[i] = false;
            }
        }
    }
}
