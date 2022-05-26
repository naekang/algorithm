import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj13241 {

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

        long gcd = GCD(Math.max(A, B), Math.min(A, B));

        System.out.println((A * B) / gcd);
    }

    static long GCD(long x, long y) {
        while (y > 0) {
            long tmp = x;
            x = y;
            y = tmp % y;
        }

        return x;
    }
}
