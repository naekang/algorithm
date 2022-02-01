import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14697 {

    static int a, b, c, N;
    static int ans;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solve(a, b, c, N);
        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
    }

    static void solve(int a, int b, int c, int N) {

        int ans = 0;

        for (int i = 0; i <= 50; i++) {
            for (int j = 0; j <= 50; j++) {
                for (int k = 0; k <= 50; k++) {
                    if ((a * i) + (b * j) + (c * k) == N) {
                        ans = 1;
                    }
                }
            }
        }
        sb.append(ans);
    }
}
