import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17266 {

    static int N, M;
    static int[] A;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        A = new int[M + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
    }

    static boolean determination(int H) {
        int last = 0;

        for (int i = 1; i <= M; i++) {
            if (A[i] - last <= H) {
                last = A[i] + H;
            } else {
                return false;
            }
        }
        return last >= N;

    }

    static void pro() {
        int L = 0;
        int R = N;
        int ans = N;

        while (L <= R) {
            int mid = (L + R) / 2;

            if (determination(mid)) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
