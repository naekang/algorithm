import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int[] result = new int[2];

        search(N, arr, result);

        System.out.print(result[0] + " " + result[1]);
    }

    private static void search(int n, int[] arr, int[] result) {

        int start = 0;
        int end = n - 1;
        int max = Integer.MAX_VALUE;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (Math.abs(sum) < max) {
                result[0] = arr[start];
                result[1] = arr[end];
                max = Math.abs(sum);
            }

            if (sum > 0) {
                end--;
            } else {
                start++;
            }
        }
    }
}
