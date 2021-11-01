import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2961 {

    static int N;
    static long[][] arr;
    static long ans = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new long[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }

        solve(0, 1, 0);
        System.out.println(ans);
    }

    static void solve(int cnt, long s, long b) {
        if (cnt > 0) {
            ans = Math.min(ans, Math.abs(s - b));
        }
        
        if (cnt == N) {
            return;
        }

        for (int i = cnt; i < N; i++) {
            solve(i + 1, s * arr[i][0], b + arr[i][1]);
        }
    }
}
