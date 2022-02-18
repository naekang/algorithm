import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2512 {

    static int N, M;
    static int[] A;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
    }

    static boolean determination(int W) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += Math.min(A[i], W);
        }

        return sum <= M;
    }

    static void pro() {
        int L = 0;
        int R = 0;
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            R = Math.max(R, A[i]);
        }

        while (L <= R) {
            int mid = (L + R) / 2;

            if (determination(mid)) {
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println(ans);
    }

}
