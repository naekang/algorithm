import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj19939 {

    static int N, K;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    static void pro() {
        final int limit = (K + 1) * K / 2;

        if (N < limit) {
            sb.append(-1);
        } else {
            N -= limit;
            if (N % K == 0) {
                sb.append(K - 1);
            } else {
                sb.append(K);
            }
        }

        System.out.println(sb.toString());
    }
}
