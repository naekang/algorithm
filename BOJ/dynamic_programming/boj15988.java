import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj15988 {

    static int N;
    static long[] Dy;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        preprocess();
        pro();
    }

    static void preprocess() {
        Dy = new long[1000001];

        Dy[0] = 1;

        for (int i = 1; i <= 1000000; i++) {
            Dy[i] = Dy[i - 1];
            if (i >= 2) {
                Dy[i] += Dy[i - 2];
            }
            Dy[i] %= 1000000009;
            if (i >= 3) {
                Dy[i] += Dy[i - 3];
            }
            Dy[i] %= 1000000009;
        }
    }

    static void pro() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        while (N-- > 0){
            int num = Integer.parseInt(br.readLine());
            sb.append(Dy[num]).append('\n');
        }

        System.out.println(sb.toString());
    }
}
