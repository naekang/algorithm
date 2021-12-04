import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if (A > B) {
            sb.append(A - B - 1).append("\n");
            for (long i = B + 1; i < A; i++) {
                sb.append(i).append(" ");
            }
        } else if (A < B) {
            sb.append(B - A - 1).append("\n");
            for (long i = A + 1; i < B; i++) {
                sb.append(i).append(" ");
            }
        } else {
            sb.append(0);
        }
        System.out.println(sb.toString());
    }
}
