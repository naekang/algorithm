import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj16208 {

    static int n;
    static long[] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
    }

    static void pro() {
        long total = 0;
        for (long num : arr) {
            total += num;
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            long tmp = arr[i];
            total -= tmp;
            ans += tmp * total;
        }

        System.out.println(ans);
    }
}
