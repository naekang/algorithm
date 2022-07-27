package javaalgo.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7569 {

    static int M, N, H;
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {0, 0, 0, 0, -1, 1};
    static int[] dh = {-1, 1, 0, 0, 0, 0};
    static int[][][] map;
    static boolean[][][] visited;
    static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new int[H][N][M];
        visited = new boolean[H][N][M];

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    map[h][n][m] = Integer.parseInt(st.nextToken());
                }
            }
        }

        bfs();

        int max = 0;
        for (int[][] ints : map) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    if (i == 0) {
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(i, max);
                }
            }
        }

        System.out.println(max - 1);
    }

    static void bfs() {
        queue = new LinkedList<>();

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (map[h][n][m] == 1) {
                        queue.add(new int[]{h, n, m});
                        visited[h][n][m] = true;
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();

            for (int i = 0; i < 6; i++) {
                int nh = loc[0] + dh[i];
                int nx = loc[1] + dx[i];
                int ny = loc[2] + dy[i];

                if (nx >= 0 && ny >= 0 && nh >= 0 && nh < H && nx < N && ny < M) {
                    if (map[nh][nx][ny] == 0 && !visited[nh][nx][ny]) {
                        queue.add(new int[]{nh, nx, ny});
                        visited[nh][nx][ny] = true;
                        map[nh][nx][ny] = map[loc[0]][loc[1]][loc[2]] + 1;
                    }
                }
            }
        }
    }
}
