package javaalgo.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2206 {

    static int N, M;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static char[][] miro;
    static int[][] map;
    static boolean[][][] visited;
    static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        miro = new char[N][M];
        map = new int[N][M];
        visited = new boolean[N][M][2];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = str.charAt(j);
            }
        }

        System.out.println(bfs(0, 0));
    }

    static int bfs(int x, int y) {
        if (N == 1 && M == 1) return 1;

        queue = new LinkedList<>();

        queue.add(new int[]{x, y, 0});

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = loc[0] + dx[i];
                int ny = loc[1] + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                if (miro[nx][ny] == '1') {
                    if (loc[2] == 0 && !visited[nx][ny][1]) {
                        visited[nx][ny][loc[2]] = true;
                        map[nx][ny] = map[loc[0]][loc[1]] + 1;
                        queue.add(new int[]{nx, ny, 1});
                    }
                } else {
                    if (!visited[nx][ny][loc[2]]) {
                        visited[nx][ny][loc[2]] = true;
                        map[nx][ny] = map[loc[0]][loc[1]] + 1;
                        queue.add(new int[]{nx, ny, loc[2]});
                    }
                }

                if (nx == N - 1 && ny == M - 1) {
                    return map[nx][ny] + 1;
                }
            }
        }
        return -1;
    }
}


