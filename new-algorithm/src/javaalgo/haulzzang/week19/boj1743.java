package javaalgo.haulzzang.week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1743 {

    static int N, M, K, cnt = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[M + 1][N + 1];
        visited = new boolean[M + 1][N + 1];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[y][x] = 1;
        }

        int ans = 0;
        for (int j = 1; j <= N; j++) {
            for (int i = 1; i <= M; i++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    cnt = 0;
                    bfs(i, j);
                    ans = Math.max(ans, cnt);
                }
            }
        }

        System.out.println(ans + 1);
    }

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx > 0 && nx <= M && ny > 0 && ny <= N) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        map[nx][ny] = map[cur[0]][cur[1]] + 1;
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                        cnt++;
                    }
                }
            }
        }
    }
}
