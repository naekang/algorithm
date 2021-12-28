import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15489 {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int sum = 0;
        dp = new int[31][31];

        dp[1][1] = 1;

        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += dp[R + i][C + j];
            }
        }

        System.out.println(sum);
    }
}
