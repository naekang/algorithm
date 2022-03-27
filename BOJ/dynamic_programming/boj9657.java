import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9657 {

    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[1001];

        dp[1] = 1;
        dp[2] = 0;
        dp[3] = 1;
        dp[4] = 1;
    }

    static void pro() {
        for (int i = 5; i <= N; i++) {
            if (dp[i - 1] + dp[i - 3] + dp[i - 4] < 3) {
                dp[i] = 1;
            } else {
                dp[i] = 0;
            }
        }

        System.out.println(dp[N] == 1 ? "SK" : "CY");
    }

}
