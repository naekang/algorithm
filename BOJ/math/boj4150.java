import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj4150 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        BigInteger[] dp = new BigInteger[N + 1];

        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);

        if (N >= 2)
            dp[2] = BigInteger.valueOf(1);

        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        System.out.println(dp[N]);
    }
}
