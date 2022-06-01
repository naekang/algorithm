import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10707 {

    static int A, B, C, D, P;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());
        P = Integer.parseInt(br.readLine());
    }

    static void pro() {
        int X = A * P;
        int Y = 0;

        if (P <= C) {
            Y = B;
        } else {
            Y = B + (P - C) * D;
        }

        System.out.println(Math.min(X, Y));
    }
}
