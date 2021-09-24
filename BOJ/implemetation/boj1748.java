import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num = 1;
        int multi = 10;

        for (int i = 1; i <= N; i++) {
            if (i % multi == 0) {
                num++;
                multi *= 10;
            }
            cnt += num;
        }
        System.out.println(cnt);
    }
}
