package javaalgo.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static Queue<int[]> queue;

    public static void main(String[] args) {
        int[][] maps1 = {{1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};

        int[][] maps2 = {{1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}};

        System.out.println(solution(maps2));

        for (int[] ints : maps2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        visited = new boolean[n][m];

        bfs(0, 0, maps);

        return maps[n - 1][m - 1] == 0 ? -1 : maps[n - 1][m - 1];
    }

    static void bfs(int x, int y, int[][] maps) {
        queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = loc[0] + dx[i];
                int ny = loc[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[]{nx, ny});
                        maps[nx][ny] = maps[loc[0]][loc[1]] + 1;
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}
