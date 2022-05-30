import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2460 {

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            cnt -= out;
            cnt += in;

            if (cnt > ans) ans = cnt;
        }

        System.out.println(ans);
    }

}
