package javaalgo.haulzzang.week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj13565 {

    static int M, N;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int j = 0; j < M; j++) {
            int[] arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt)
                .toArray();
            for (int i = 0; i < N; i++) {
                map[i][j] = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            if (map[i][0] == 0) {
                bfs(i, 0);
            }
        }

        for (int i = 0; i < N; i++) {
            if (map[i][M - 1] > 1) {
                System.out.println("YES");
                System.exit(0);
            }
        }

        System.out.println("NO");
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

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (!visited[nx][ny] && map[nx][ny] == 0) {
                        map[nx][ny] = map[cur[0]][cur[1]] + 1;
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
