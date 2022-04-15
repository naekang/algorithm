import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj4375 {

    static int n;

    public static void main(String[] args) throws IOException {
        inputAndPrintAns();
    }

    static void inputAndPrintAns() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);

            System.out.println(solve(n));
        }
    }

    static int solve(int num) {

        int idx = 1;
        int cnt = 1;

        while (true) {
            if (idx % num == 0) break;

            cnt++;

            idx = ((idx * 10) + 1) % num;
        }

        return cnt;
    }
}
