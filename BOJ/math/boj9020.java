import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9020 {

    static int T;
    static int[] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        arr = new int[T];
        check = new boolean[10001];

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void pro() {
        isPrime();

        for (int i = 0; i < T; i++) {
            int first = arr[i] / 2;
            int second = arr[i] / 2;

            while (true) {
                if (!check[first] && !check[second]) {
                    sb.append(first).append(' ').append(second).append('\n');
                    break;
                }
                first--;
                second++;
            }
        }

        System.out.println(sb.toString());
    }

    static void isPrime() {
        check[0] = true;
        check[1] = true;

        for (int i = 2; i <= Math.sqrt(check.length); i++) {
            if (check[i]) continue;

            for (int j = i * i; j < check.length; j += i) {
                check[j] = true;
            }
        }
    }
}
