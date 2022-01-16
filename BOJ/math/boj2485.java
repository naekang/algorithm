import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] gapArr = new int[N - 1];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i > 0) {
                gapArr[i - 1] = arr[i] - arr[i - 1];
            }
        }

        for (int i = 0; i <= gapArr.length - 2; i++) {
            gapArr[i + 1] = gcd(gapArr[i], gapArr[i + 1]);
        }

        int gap = gapArr[gapArr.length - 1];

        System.out.println((arr[N - 1] - arr[0]) / gap - (N - 1));
    }

    private static int gcd(int x, int y) {
        while (y > 0) {
            int tmp = x;

            x = y;
            y = tmp % y;
        }
        return x;
    }
}
