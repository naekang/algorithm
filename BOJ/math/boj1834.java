import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1834 {

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
        int cnt = N - 1;
        int start = N + 1;
        long end = (long) (N + 1) * (N - 1);
        long ans = cnt * (start + end) / 2;

        System.out.println(ans);
    }

}
