import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2003 {

    static int N, M;
    static int[] A;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        int R = 0;
        int sum = 0;
        int ans = 0;

        for (int L = 1; L <= N; L++) {
            sum -= A[L - 1];

            while (R + 1 <= N && sum < M) {
                R++;
                sum += A[R];
            }

            if (sum == M) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
