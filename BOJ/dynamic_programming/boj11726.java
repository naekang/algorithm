import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];

        arr[0] = 1;
        arr[1] = 1;

        if (N >= 2) {
            for (int i = 2; i <= N; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
            }
        }
        System.out.println(arr[N]);
    }
}
