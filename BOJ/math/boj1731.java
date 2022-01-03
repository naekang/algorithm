import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        if ((arr[2] - arr[1]) == (arr[1] - arr[0])) {
            int gap = arr[1] - arr[0];

            System.out.println(arr[N - 1] + gap);
        } else {
            int gap = arr[1] / arr[0];

            System.out.println(arr[N - 1] * gap);
        }
    }
}
