import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1436 {

    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solve(N);
        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
    }

    static void solve(int index) {
        int cnt = 1;
        int num = 666;

        while (cnt != index) {
            num++;
            if (String.valueOf(num).contains("666"))
                cnt++;
        }
        sb.append(num);
    }
}
