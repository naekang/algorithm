package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14889 {

    static int N, answer = Integer.MAX_VALUE;
    static int[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        input();
        backTracking(1, 0);
        System.out.println(answer);
    }

    static void backTracking(int idx, int depth) {
        if (depth == N / 2) {
            int start = 0;
            int link = 0;

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (visited[i] && visited[j]) {
                        start += map[i][j];
                    }
                    if (!visited[i] && !visited[j]) {
                        link += map[i][j];
                    }
                }
            }

            answer = Math.min(Math.abs(start - link), answer);

            return;
        }

        for (int i = idx; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backTracking(idx + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
