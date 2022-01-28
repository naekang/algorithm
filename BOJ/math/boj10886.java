import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int num : arr) {
            if (num == 1) {
                cnt++;
            }
        }

        System.out.println(((N - cnt) < cnt) ? "Junhee is cute!" : "Junhee is not cute!");
    }
}
