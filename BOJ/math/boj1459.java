import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1459 {

    static int X, Y, W, S;
    static long cost1, cost2, cost3;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
    }

    static void pro() {
        // 수평, 수직으로만 이동
        cost1= (long) (X + Y) * W;

        // 대각선으로만 이동
        if ((X + Y) % 2 == 0) {
            cost2 = (long) Math.max(X, Y) * S;
        } else {
            cost2 = (long) (Math.max(X, Y) - 1) * S + W;
        }

        // 대각선 + 수평, 수직
        cost3 = (long) Math.min(X, Y) * S + (long) Math.abs(X - Y) * W;

        System.out.println(Math.min(Math.min(cost1, cost2), cost3));
    }
}
