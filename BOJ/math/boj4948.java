import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj4948 {

    static boolean[] primeNum = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        check();


        while (true) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;

            if (N == 0) {
                break;
            }
            for (int i = N + 1; i <= 2 * N; i++) {
                if (!primeNum[i])
                    cnt++;
            }
            System.out.println(cnt);
        }
    }

    static void check() {
        primeNum[0] = true;
        primeNum[1] = true;

        for (int i = 2; i <= Math.sqrt(primeNum.length); i++) {
            if (primeNum[i]) {
                continue;
            }
            for (int j = i * i; j < primeNum.length; j += i) {
                primeNum[j] = true;
            }
        }
    }
}
