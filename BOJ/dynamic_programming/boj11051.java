import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11051 {

    static int N, K;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[1001][1001];
    }

    static void pro() {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) dp[i][j] = 1;
                else if (j == 0) dp[i][j] = 1;
                else dp[i][j] = (dp[i-1][j-1] + dp[i -1][j]) % 10_007;
            }
        }

        System.out.println(dp[N][K]);
    }
}