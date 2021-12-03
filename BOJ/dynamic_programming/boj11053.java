import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] dp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if ((arr[j] < arr[i]) && (dp[i] < dp[j] + 1)) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = -1;
        for (int i = 0; i < N; i++) {
            if (dp[i] > max)
                max = dp[i];
            else
                max = max;
        }
        System.out.println(max);
    }
}
