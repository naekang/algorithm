import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2921 {

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
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= i * 2; j++) {
                sum += j;
            }
        }

        System.out.println(sum);
    }
}
