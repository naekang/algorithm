import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        String[] str = br.readLine().split("");

        Arrays.stream(str).forEach(x -> {
            int N = Integer.parseInt(x);

            if (N == 9) {
                N = 6;
            }
            arr[N]++;
        });
        arr[6] = arr[6] / 2 + arr[6] % 2;
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
