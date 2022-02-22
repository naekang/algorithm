import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj10826 {

    static int n;
    static BigInteger[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new BigInteger[n + 1];
    }

    static void pro() {
        if (n == 0) {
            sb.append('0');
        } else if (n == 1) {
            sb.append('1');
        } else {
            arr[0] = BigInteger.valueOf(0);
            arr[1] = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1].add(arr[i - 2]);

            }
            sb.append(arr[n]);
        }

        System.out.println(sb.toString());
    }
}
