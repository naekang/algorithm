package javaalgo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// n = 2 -> 2
// n = 3 -> 3
// n = 4 -> 5

public class boj11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 2];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}
