import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2828 {

    static int N, M;
    static int J;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        J = Integer.parseInt(br.readLine());
        arr = new int[J];

        for (int i = 0; i < J; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void pro() {

        int L = 1;
        int R = M;
        int sum = 0;

        for (int i = 0; i < J; i++) {
            if (L <= arr[i] && arr[i] <= R) {
                continue;
            }

            if (L > arr[i]) {
                sum += (L - arr[i]);
                R -= (L - arr[i]);
                L = arr[i];
            } else {
                sum += (arr[i] - R);
                L += (arr[i] - R);
                R = arr[i];
            }
        }

        System.out.println(sum);
    }
}
