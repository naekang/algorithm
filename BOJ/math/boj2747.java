import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2747 {

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
        int idx_0 = 0;
        int idx_1 = 1;
        int idx_2 = 1;

        for (int i = 2; i <= N; i++) {
            idx_2 = idx_0 + idx_1;
            idx_0 = idx_1;
            idx_1 = idx_2;
        }

        System.out.println(idx_2);
    }
}
