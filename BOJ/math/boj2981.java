import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int val = arr[1] - arr[0];

        for (int i = 2; i < N; i++) {
            val = gcd(val, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= val; i++) {
            if (val % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int z = x % y;
            x = y;
            y = z;
        }
        return x;
    }
}
