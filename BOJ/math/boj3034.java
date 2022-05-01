import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3034 {

    static int N, W, H;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num <= W) {
                sb.append("DA").append('\n');
            } else if (num <= H) {
                sb.append("DA").append('\n');
            } else if (num <= Math.sqrt(W * W + H * H)) {
                sb.append("DA").append('\n');
            } else {
                sb.append("NE").append('\n');
            }
        }

        System.out.println(sb.toString());
    }

}
