import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int ans = 0;

        for (int i = 0; i <= K; i++) {
            int j = K - i;
            int newN = N - j;
            int newM = M - i;

            if (newN < 0 || newM < 0) {
                continue;
            }

            if (newN / 2 >= newM) {
                ans = Math.max(ans, newM);
            } else {
                ans = Math.max(ans, newN / 2);
            }
        }

        System.out.println(ans);
    }
}
