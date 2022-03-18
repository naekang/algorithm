import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1855 {

    static int K;
    static String str;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        K = Integer.parseInt(br.readLine());
        str = br.readLine();
    }

    static void pro() {
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < str.length() / K; j++) {
                int index = j % 2 == 0 ? K * j + i : K * j + K - 1 - i;
                sb.append(str.charAt(index));
            }
        }

        System.out.println(sb.toString());
    }

}
