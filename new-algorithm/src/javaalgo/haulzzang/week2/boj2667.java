package javaalgo.haulzzang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj2667 {

    static int N, cnt;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static String solution() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cnt = 0;
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(i, j);
                    cnt++;
                    list.add(cnt);
                }
            }
        }

        Collections.sort(list);

        sb.append(list.size()).append('\n');
        for (Integer integer : list) {
            sb.append(integer).append('\n');
        }

        return sb.toString();
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if ((nx >= 0 && ny >= 0 && nx < N && ny < N) && (!visited[nx][ny] && map[nx][ny] == 1)) {
                cnt++;
                dfs(nx, ny);
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }
    }
}
