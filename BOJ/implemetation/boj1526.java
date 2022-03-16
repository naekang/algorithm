import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1526 {

    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
    }

    static void pro() {
        for (int i = N; i >= 4; i--) {
            boolean check = true;
            int num = i;

            while (num != 0) {
                if (num % 10 == 4 || num % 10 == 7) {
                    num /= 10;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                sb.append(i);
                break;
            }
        }

        System.out.println(sb.toString());
    }

}
