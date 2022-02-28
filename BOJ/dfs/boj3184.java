import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3184 {

    static int R, C, totalSheep, totalWolf, sheep, wolf;
    static boolean[][] visit;
    static String[] a;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        a = new String[R];
        visit = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            a[i] = br.readLine();
        }
    }

    static void dfs(int x, int y) {
        if (a[x].charAt(y) == 'v') wolf++;
        if (a[x].charAt(y) == 'o') sheep++;

        visit[x][y] = true;
        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
            if (a[nx].charAt(ny) == '#') continue;
            if (visit[nx][ny]) continue;

            dfs(nx, ny);
        }
    }

    static void pro() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visit[i][j] && a[i].charAt(j) != '#') {
                    sheep = 0;
                    wolf = 0;
                    dfs(i, j);
                    if (sheep > wolf) totalSheep += sheep;
                    else totalWolf += wolf;
                }
            }
        }

        sb.append(totalSheep).append(' ').append(totalWolf);
        System.out.println(sb.toString());
    }
}
