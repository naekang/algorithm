import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = gcd(a, b);

            System.out.print(a * b / c + " " + c);
            System.out.println();
        }
    }

    private static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        }

        return gcd(y, x % y);
    }
}
