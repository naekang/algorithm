package javaalgo.haulzzang.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj17836 {

    static int N, M, T;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = bfs(0, 0);

        System.out.println(ans == -1 ? "Fail" : ans);
    }

    static int bfs(int x, int y) {
        Queue<Board> q = new LinkedList<>();

        q.add(new Board(x, y, 0, false));
        visited[x][y][0] = true;

        while (!q.isEmpty()) {
            Board cur = q.poll();

            if (cur.cnt > T) break;
            if (cur.x == N - 1 && cur.y == M - 1) return cur.cnt;

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (!cur.isGram) {
                        if (!visited[nx][ny][0] && map[nx][ny] == 0) {
                            q.add(new Board(nx, ny, cur.cnt + 1, false));
                            visited[nx][ny][0] = true;
                        } else if (!visited[nx][ny][0] && map[nx][ny] == 2) {
                            q.add(new Board(nx, ny, cur.cnt + 1, true));
                            visited[nx][ny][1] = true;
                        }
                    } else {
                        if (!visited[nx][ny][1]) {
                            q.add(new Board(nx, ny, cur.cnt + 1, true));
                            visited[nx][ny][1] = true;
                        }
                    }
                }
            }
        }

        return -1;
    }

    public static class Board {
        int x, y, cnt;
        boolean isGram;

        public Board(int x, int y, int cnt, boolean isGram) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.isGram = isGram;
        }
    }
}
