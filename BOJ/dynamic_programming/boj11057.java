import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11057 {

    static int N;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1][10];
    }

    static void pro() {
        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i <= 9; i++) {
            ans += dp[N][i];
            ans %= 10007;
        }

        System.out.println(ans);
    }
}
