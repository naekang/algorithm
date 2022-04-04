import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1309 {

    static int N;
    static int[][] Dy;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        Dy = new int[N + 1][3];
    }

    static void pro() {
        Dy[1][0] = 1;
        Dy[1][1] = 1;
        Dy[1][2] = 1;

        for (int i = 2; i <= N; i++) {
            for (int prev = 0; prev <= 2; prev++) {
                Dy[i][0] += Dy[i - 1][prev];
                Dy[i][0] %= 9901;
                for (int j = 0; j < 2; j++) {
                    if ((prev & (1 << j)) != 0) continue;
                    Dy[i][1 << j] += Dy[i - 1][prev];
                    Dy[i][1 << j] %= 9901;
                }
            }
        }

        System.out.println((Dy[N][0] + Dy[N][1] + Dy[N][2]) % 9901);
    }

}
