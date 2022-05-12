import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj17283 {

    static int L, R;

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        L = Integer.parseInt(br.readLine());
        R = Integer.parseInt(br.readLine());

        int ans = 0, T = 2;

        while (true) {
            L *= (double) R / 100;
            if (L <= 5) break;
            ans += T * L;
            T *= 2;
        }

        System.out.println(ans);
    }
}
