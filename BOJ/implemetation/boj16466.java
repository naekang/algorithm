import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj16466 {

    static int N;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {

        Arrays.sort(arr);

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (arr[i] != i) {
                sb.append(i);
                cnt++;
                break;
            }
        }

        if (cnt == 0) {
            sb.append(N + 1);
        }

        System.out.println(sb.toString());
    }
}
