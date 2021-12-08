import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int num = (N / 100) * 100;

        while (true) {
            if (num % F == 0) {
                int ans = num % 100;
                if (num % 100 < 10) {
                    System.out.println("0" + ans);
                } else
                    System.out.println(ans);
                return;
            }
            num++;
        }
    }
}
