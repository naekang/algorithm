import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17521 {

    static int n;
    static long w;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        w = Long.parseLong(st.nextToken());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void pro() {
        long cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (w >= arr[i]) {
                    cnt += w / arr[i];
                    w %= arr[i];
                }
            } else if (arr[i] > arr[i + 1]) {
                w += cnt * arr[i];
                cnt = 0;
            }
        }

        w += cnt * arr[n - 1];

        System.out.println(w);
    }

}
