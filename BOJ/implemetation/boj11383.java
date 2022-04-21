import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11383 {

    static int N, M;
    static String str1, str2;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        str1 = str2 = "";
        for (int i = 0; i < N; i++) str1 += br.readLine();
        for (int i = 0; i < N; i++) str2 += br.readLine();
    }

    static void pro() {
        boolean flag = false;

        for (int i = 0; i < N * M * 2; i++) {
            if (str1.charAt(i / 2) != str2.charAt(i)) {
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "Not Eyfa" : "Eyfa");
    }
}
