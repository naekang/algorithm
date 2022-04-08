import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5555 {

    static String str;
    static String[] arr;
    static int N;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        N = Integer.parseInt(br.readLine());
        arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
    }

    static void pro() {

        int cnt = 0;

        for (String s : arr) {
            s += s;
            if (s.contains(str)) cnt++;
        }

        System.out.println(cnt);
    }

}
