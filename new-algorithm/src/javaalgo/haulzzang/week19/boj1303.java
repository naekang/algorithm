package javaalgo.haulzzang.week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1303 {

    static int N, M, cnt = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[M][N];
        visited = new boolean[M][N];
        for (int j = 0; j < M; j++) {
            char[] arr = br.readLine().toCharArray();
            for (int i = 0; i < N; i++) {
                map[j][i] = arr[i];
            }
        }

        int white = 0;
        int black = 0;
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                if (!visited[j][i]) {
                    char color = map[j][i];
                    cnt = 0;
                    dfs(i, j, color);

                    if (color == 'W') {
                        white += cnt * cnt;
                    }
                    if (color == 'B') {
                        black += cnt * cnt;
                    }
                }
            }
        }

        System.out.println(white + " " + black);
    }

    static void dfs(int x, int y, char color) {
        visited[y][x] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                if (!visited[ny][nx] && map[ny][nx] == color) {
                    dfs(nx, ny, map[ny][nx]);
                }
            }
        }
    }
}
