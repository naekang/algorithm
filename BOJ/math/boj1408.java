import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1408 {

    static int h, m, s;
    static int now, start;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        now = (h * 3600) + (m * 60) + s;

        st = new StringTokenizer(br.readLine(), ":");
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        start = (h * 3600) + (m * 60) + s;
    }

    static void pro() {
        int remain = 0;

        if (start > now) {
            remain = start - now;
        } else {
            remain = (24 * 3600) - (now - start);
        }

        System.out.printf("%02d:%02d:%02d", (remain / 3600), ((remain / 60) % 60), (remain % 60));
    }
}
