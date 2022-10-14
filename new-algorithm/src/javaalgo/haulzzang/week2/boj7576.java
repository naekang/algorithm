package javaalgo.haulzzang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7576 {

    static int M, N;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {
        bfs();

        int ans = 0;
        for (int[] rows : map) {
            for (int num : rows) {
                if (num == 0) {
                    return -1;
                }
                ans = Math.max(ans, num);
            }
        }

        return ans - 1;
    }

    static void bfs() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = loc[0] + dx[i];
                int ny = loc[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (!visited[nx][ny] && map[nx][ny] >= 0) {
                        queue.add(new int[]{nx, ny});
                        map[nx][ny] = map[loc[0]][loc[1]] + 1;
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        visited = new boolean[M][N];

        for (int j = 0; j < N; j++) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
