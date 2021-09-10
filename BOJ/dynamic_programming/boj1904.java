import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1904 {

    static int[] arr = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= N; i++) {
            arr[i] = -1;
        }
        System.out.println(dp(N));
    }

    static int dp(int n) {
        if (arr[n] == -1) {
            arr[n] = (dp(n - 1) + dp(n - 2)) % 15746;
        }
        return arr[n];
    }
}
