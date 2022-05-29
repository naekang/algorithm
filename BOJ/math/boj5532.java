import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5532 {

    static int L, A, B, C, D;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        L = Integer.parseInt(br.readLine());
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());
    }


    static void pro() {
        int max = 0;
        int korean = A % C == 0 ? A / C : A / C + 1;
        int math = B % D == 0 ? B / D : B / D + 1;

        System.out.println(L - Math.max(korean, math));

    }
}
