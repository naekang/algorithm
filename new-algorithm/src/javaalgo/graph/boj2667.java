package javaalgo.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj2667 {

    static int N, cnt;
    static int[][] map;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cnt = 0;
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    dfs(i, j);
                    answer.add(cnt);
                }
            }
        }

        Collections.sort(answer);
        sb.append(answer.size()).append('\n');
        for (Integer integer : answer) {
            sb.append(integer).append('\n');
        }

        System.out.println(sb);

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    cnt++;
                    dfs(nx, ny);
                }
            }
        }
    }
}
