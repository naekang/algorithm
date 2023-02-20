package javaalgo.haulzzang.week21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class prms_무인도_여행 {

    public static void main(String[] args) {
        prms_무인도_여행 sol = new prms_무인도_여행();
        String[] maps1 = {"X591X", "X1X5X", "X231X", "1XXX1"};
        System.out.println(Arrays.toString(sol.solution(maps1)));

        String[] maps2 = {"XXX","XXX","XXX"};
        System.out.println(Arrays.toString(sol.solution(maps2)));
    }


    static int M, N, cnt;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] map;
    static boolean[][] visited;

    public int[] solution(String[] maps) {
        M = maps[0].length();
        N = maps.length;
        map = new char[M][N];
        visited = new boolean[M][N];

        for (int j = 0; j < N; j++) {
            char[] arr = maps[j].toCharArray();
            for (int i = 0; i < M; i++) {
                map[i][j] = arr[i];
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                if (!visited[i][j] && map[i][j] != 'X') {
                    cnt = 0;
                    bfs(i, j);
                    answer.add(cnt);
                }
            }
        }

        if (answer.isEmpty()) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{x, y});
        visited[x][y] = true;
        cnt = map[x][y] - '0';

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    if (!visited[nx][ny] && map[nx][ny] != 'X') {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        cnt += map[nx][ny] - '0';
                    }
                }
            }
        }
    }
}
