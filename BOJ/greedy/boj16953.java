import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj16953 {

    static long A, B;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
    }

    static void pro() {
        int ans = 1;

        while (B != A) {
            if (B < A) {
                ans = - 1;
                break;
            }

            String str = String.valueOf(B);

            if (str.charAt(str.length() - 1) != '1' && B % 2 != 0) {
                ans = -1;
                break;
            }

            if (B % 2 == 0) {
                B >>= 1;
            } else {
                str = str.substring(0, str.length() - 1);
                B = Long.parseLong(str);
            }

            ans++;
        }

        System.out.println(ans);
    }
}
