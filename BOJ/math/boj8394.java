import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj8394 {

    static int n;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }

    static void pro() {
        int a = 1, b = 1;

        for (int i = 2; i <= n; i++) {
            int tmp = a;
            a = (a + b) % 10;
            b = tmp;
        }

        System.out.println(a);
    }
}
