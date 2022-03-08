import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj13301 {

    static int N;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new long[N + 1];
    }

    static void pro() {
        dp[0] = 2;
        dp[1] = 4;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[N]);
    }
}
