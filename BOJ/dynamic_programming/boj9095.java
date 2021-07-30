import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(sol(N));
        }
    }

    static int sol(int i) {
        if (i == 1)
            return 1;
        else if (i == 2)
            return 2;
        else if (i == 3)
            return 4;
        else
            return sol(i - 3) + sol(i - 2) + sol(i - 1);
    }
}
