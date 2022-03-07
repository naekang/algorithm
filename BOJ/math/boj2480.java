import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2480 {

    static int a, b, c;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

    static void pro() {
        if (a == b && b == c) {
            sb.append(10000 + a * 1000);
        } else if (a == b || a == c) {
            sb.append(1000 + a * 100);
        } else if (b == c) {
            sb.append(1000 + b * 100);
        } else {
            sb.append(Math.max(Math.max(a, b), c) * 100);
        }

        System.out.println(sb.toString());
    }
}
