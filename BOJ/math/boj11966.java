import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11966 {

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
        while (N != 1) {
            if (N % 2 == 1) {
                System.out.println(0);
                return;
            }
            N /= 2;
        }
        System.out.println(1);
    }
}
