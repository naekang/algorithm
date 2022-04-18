import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2004 {

    static int n, m;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }

    static void pro() {
        long cntTwo = countTwo(n) - countTwo(m) - countTwo(n - m);
        long cntFive = countFive(n) - countFive(m) - countFive(n - m);

        System.out.println(Math.min(cntTwo, cntFive));
    }

    static long countTwo(int num) {
        long tmp = 0;
        if (num < 2) return 0;
        for (long i = 2; i <= num; i *= 2) {
            tmp += num / i;
        }
        return tmp;
    }

    static long countFive(int num) {
        long tmp = 0;
        if (num < 5) return 0;
        for (long i = 5; i <= num; i *= 5) {
            tmp += num / i;
        }
        return tmp;
    }
}
