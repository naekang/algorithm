package javaalgo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[][] dp = new int[31][31];

        for (int i = 0; i < 31; i++) {
            dp[i][0] = 1;
            dp[i][1] = i;
        }

        for (int i = 2; i < 31; i++) {
            for (int j = 2; j < 31; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(dp[M][N]).append('\n');
        }

        System.out.println(sb);
    }
}


// nCr = n-1 C r-1 + n-1 C r