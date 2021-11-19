import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int ans = 0;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            int C = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            ans += C * K;
        }
        System.out.println(ans);
    }
}
