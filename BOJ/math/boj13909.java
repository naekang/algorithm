import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj13909 {

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
        int cnt = 0;

        for (int i = 1; i * i <= N; i++) {
            cnt++;
        }

        System.out.println(cnt);
    }
}
