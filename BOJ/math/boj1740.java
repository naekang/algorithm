import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1740 {

    static long N;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Long.parseLong(br.readLine());
    }

    static void pro() {
        int cnt = 0;
        long ans = 0;

        while (N != 0) {
            if ((N & 1) == 1) {
                ans += power(3, cnt);
            }
            cnt++;
            N = (N >> 1);
        }

        System.out.println(ans);
    }

    static long power(long x, long y) {
        if (y == 0) return 1;
        if (y == 1) return x;

        long tmp = power(x, y / 2);

        if (y % 2 == 0) {
            return tmp * tmp;
        } else {
            return (tmp * tmp) * x;
        }
    }

}
