import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj6359 {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k * j <= n; k++) {
                    if (arr[j * k] != 0) {
                        arr[j * k] = 0;
                    } else {
                        arr[j * k] = 1;
                    }
                }
            }
            int ans =0;
            for (int j = 1; j <= n; j++) {
                ans += arr[j];
            }
            System.out.println(ans);
        }
    }
}
