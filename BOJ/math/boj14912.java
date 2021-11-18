import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            String num = Integer.toString(i);
            for (int j = 0; j < num.length(); j++) {
                int idx = num.charAt(j) - '0';
                if (idx == d) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
