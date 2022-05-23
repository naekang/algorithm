import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1598 {

    static int N, M;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    static void pro() {
        int x1, y1, x2, y2;

        if (N % 4 == 0) {
            x1 = N / 4;
            y1 = 1;
        } else {
            x1 = (N / 4) + 1;
            y1 = 5 - (N % 4);
        }

        if (M % 4 == 0) {
            x2 = M / 4;
            y2 = 1;
        } else {
            x2 = (M / 4) + 1;
            y2 = 5 - (M % 4);
        }

        System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }

}
