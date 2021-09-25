import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int top = A * D + B * C;
        int bottom = B * D;

        int num = gcd(top, bottom);

        System.out.println(top/num + " " + bottom/num);
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }

        if (x <= y) {
            int tmp = x;
            x = y;
            y = tmp;
        }

        return gcd(y, x % y);
    }
}
