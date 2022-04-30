import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj3004 {

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
        if (N % 2 == 0) {
            N = N / 2 + 1;
            System.out.println(N * N);
        } else {
            int num1 = ((N - 1) / 2) + 1;
            int num2 = ((N + 1) / 2) + 1;

            System.out.println(num1 * num2);
        }
    }
}
