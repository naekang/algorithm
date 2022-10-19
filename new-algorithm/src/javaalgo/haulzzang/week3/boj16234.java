package javaalgo.haulzzang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj16234 {

    static int N, L, R;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {
        int answer = 0;

        while (true) {
            visited = new boolean[N][N];
            boolean flag = false;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        if (bfs(i, j)) {
                            flag = true;
                        }
                    }
                }
            }

            if (flag) answer++;
            else break;
        }

        return answer;
    }

    static boolean bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        Queue<int[]> groupQueue = new LinkedList<>();

        int sum = map[x][y];

        queue.add(new int[]{x, y});
        groupQueue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = loc[0] + dx[i];
                int ny = loc[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (!visited[nx][ny]) {
                        int diff = Math.abs(map[nx][ny] - map[loc[0]][loc[1]]);

                        if (diff >= L && diff <= R) {
                            sum += map[nx][ny];
                            queue.add(new int[]{nx, ny});
                            groupQueue.add(new int[]{nx, ny});
                            visited[nx][ny] = true;
                        }
                    }
                }
            }
        }

        if (groupQueue.size() == 1) {
            return false;
        } else {
            int avg = sum / groupQueue.size();
            for (int[] points : groupQueue) {
                map[points[0]][points[1]] = avg;
            }
            return true;
        }
    }



    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
