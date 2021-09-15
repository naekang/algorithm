import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[8][2];
        int[] result = new int[5];
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i + 1;
        }

        Arrays.sort(arr, (int[] a, int[] b) -> {
            return b[0] - a[0];
        });

        for (int i = 0; i < 5; i++) {
            sum += arr[i][0];
            result[i] = arr[i][1];
        }

        Arrays.sort(result);

        System.out.println(sum);

        for (int i = 0; i < 5; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
