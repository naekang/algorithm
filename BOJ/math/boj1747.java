import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1747 {

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

        for (int i = N; ; i++) {
            if (isPrime(i) && isPalin(i)) {
                System.out.println(i);
                break;
            }
        }

    }

    static boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    static boolean isPalin(int num) {
        String str = String.valueOf(num);

        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
