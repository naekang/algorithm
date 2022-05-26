import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj19947 {

    static int H, Y;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        dp = new long[Y + 1];
    }

    static void pro() {
        dp[0] = H;

        for (int i = 1; i <= Y; i++) {
            dp[i] = (long) Math.floor(dp[i - 1] * 1.05);
            if (i >= 3) {
                dp[i] = Math.max((long) Math.floor(dp[i - 3] * 1.2), dp[i]);
            }
            if (i >= 5) {
                dp[i] = Math.max((long) Math.floor(dp[i - 5] * 1.35), dp[i]);
            }
        }

        System.out.println(dp[Y]);
    }

}
