import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj15819 {

    static int N, I;
    static String[] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(st.nextToken());

        arr = new String[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }
    }

    static void pro() {
        Arrays.sort(arr);

        System.out.println(arr[I - 1]);
    }
}
