import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            cnt = (out == 0) ? in : cnt - out + in;

            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}
