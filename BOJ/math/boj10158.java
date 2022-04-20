import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10158 {

    static int w, h, p, q, t;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        t = Integer.parseInt(br.readLine());
    }

    static void pro() {
        int dx = (p + t) % (2 * w);
        int dy = (q + t) % (2 * h);

        dx = w - Math.abs(w - dx);
        dy = h - Math.abs(h - dy);

        System.out.println(dx + " " + dy);
    }
}
