import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj14606 {

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
        if (N == 1) System.out.println(0);
        else System.out.println(N * (N - 1) / 2);
    }
}
