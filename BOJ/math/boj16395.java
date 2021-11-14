import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj16395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(comb(n- 1, k - 1));
    }

    private static int comb(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        }

        return comb(n - 1, k - 1) + comb(n - 1, k);
    }
}
