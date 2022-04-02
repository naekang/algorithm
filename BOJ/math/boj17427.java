import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj17427 {

    static int N;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
    }

    static void pro() {
        System.out.println(getSum(N));
    }

    static long getSum(int n) {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (n / i) * i;
        }

        return sum;
    }
}
