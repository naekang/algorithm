import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10026 {

    static int N;
    static int[] dx = {0, 1, 0, -1}; // 상 하 좌 우
    static int[] dy = {-1, 0, 1, 0};
    static char[][] map;
    static int[][] normal;
    static int[][] weakness;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.valueOf(st.nextToken());

        map = new char[N][];
        normal = new int[N][N];
        weakness = new int[N][N];

        int normalCnt = 0;
        int weaknessCnt = 0;

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (normal[i][j] == 0) {
                    normalCnt++;
                    normalDfs(i, j, map[i][j], normalCnt);
                }
                if (weakness[i][j] == 0) {
                    weaknessCnt++;
                    weaknessDfs(i, j, map[i][j], normalCnt);
                }
            }
        }
        System.out.println(normalCnt + " " + weaknessCnt);
    }

    static void normalDfs(int y, int x, char color, int cnt) {
        normal[y][x] = cnt;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                continue;
            }
            if (normal[ny][nx] != 0) {
                continue;
            }

            char nc = map[ny][nx];
            if (nc == color) {
                normalDfs(ny, nx, nc, cnt);
            }
        }
    }

    static void weaknessDfs(int y, int x, char color, int cnt) {
        weakness[y][x] = cnt;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                continue;
            }
            if (weakness[ny][nx] != 0) {
                continue;
            }

            char nc = map[ny][nx];
            if (nc == color) {
                weaknessDfs(ny, nx, nc, cnt);
            } else {
                if (color == 'R' && nc == 'G' || color == 'G' && nc == 'R') {
                    weaknessDfs(ny, nx, nc, cnt);
                }
            }
        }
    }

}
