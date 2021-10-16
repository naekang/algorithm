import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11401 {

    final static long P = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long bottom = factorial(N);
        long top = factorial(K) * factorial(N - K) % P;

        System.out.println(bottom * pow(top, P - 2) % P);
    }

    static long factorial(long N) {
        long num = 1L;

        while (N > 1) {
            num = (num * N) % P;
            N--;
        }
        return num;
    }

    static long pow(long x, long y) {
        if (y == 1) {
            return x % P;
        }

        long tmp = pow(x, y / 2);

        if (y % 2 == 1) {
            return (tmp * tmp % P) * x % P;
        }
        return tmp * tmp % P;
    }
}
