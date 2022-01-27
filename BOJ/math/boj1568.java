import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int bird = 1;

        while (N > 0) {
            if (N < bird) {
                bird = 1;
            }
            N -= bird;
            bird++;
            cnt++;
        }

        System.out.println(cnt);
    }
}
