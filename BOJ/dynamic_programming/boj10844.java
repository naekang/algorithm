import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10844 {

    static Long[][] dp;
    final static long m = 1_000_000_000L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long ans = 0;
        dp = new Long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        for (int i = 1; i <= 9; i++) {
            ans += recur(N, i);
        }

        System.out.println(ans % m);
    }

    private static long recur(int index, int num) {
        if (index == 1) {
            return dp[index][num];
        }

        if (dp[index][num] == null) {
            if (num == 0) {
                dp[index][num] = recur(index - 1, 1);
            } else if (num == 9) {
                dp[index][num] = recur(index - 1, 8);
            } else {
                dp[index][num] = recur(index - 1, num - 1) + recur(index - 1, num + 1);
            }
        }
        return dp[index][num] % m;
    }
}
