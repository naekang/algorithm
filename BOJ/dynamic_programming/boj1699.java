import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1699 {

    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
    }

    static void pro() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (dp[i] > dp[i - j * j] || dp[i] == 0) {
                    dp[i] = dp[i - j * j] + 1;
                }
            }
        }

        System.out.println(dp[N]);
    }
}
