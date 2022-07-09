package javaalgo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1003 {

    static int[][] dp = new int[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            fibo(N);

            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append('\n');
        }

        System.out.println(sb);
    }

    static int[] fibo(int num) {
        if (dp[num][0] < 0 || dp[num][1] < 0) {
            dp[num][0] = fibo(num - 1)[0] + fibo(num - 2)[0];
            dp[num][1] = fibo(num - 1)[1] + fibo(num - 2)[1];
        }

        return dp[num];
    }
}
