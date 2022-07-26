package javaalgo.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7562 {

    static int I;
    static int[] dx = {2, 1, 2, 1, -1, -2, -2, -1};
    static int[] dy = {1, 2, -1, -2, 2, 1, -1, -2};
    static int[][] map;
    static boolean[][] visited;
    static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            I = Integer.parseInt(br.readLine());
            map = new int[I][I];
            visited = new boolean[I][I];
            queue = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int targetX = Integer.parseInt(st.nextToken());
            int targetY = Integer.parseInt(st.nextToken());

            bfs(x, y);

            sb.append(map[targetX][targetY]).append('\n');
        }

        System.out.println(sb);
    }

    static void bfs(int x, int y) {
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nx = loc[0] + dx[i];
                int ny = loc[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < I && ny < I) {
                    if (!visited[nx][ny]) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        map[nx][ny] = map[loc[0]][loc[1]] + 1;
                    }
                }
            }
        }

    }
}
