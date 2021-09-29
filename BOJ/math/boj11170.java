import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int cnt = 0;

            for (int i = N; i <= M; i++) {
                cnt += count(i);
            }

            System.out.println(cnt);
        }
    }

    static int count(int num) {
        int ans = 0;
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '0') {
                ans++;
            }
        }
        return ans;
    }
}
