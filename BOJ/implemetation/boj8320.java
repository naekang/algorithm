import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj8320 {

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
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j * i <= n; j++) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
