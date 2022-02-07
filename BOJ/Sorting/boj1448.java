import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class boj1448 {

    static int N;
    static Integer[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solve(N);
        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void solve(int n) {
        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            if (arr[i] < arr[i + 1] + arr[i + 2]) {
                result = Math.max(result, arr[i] + arr[i + 1] + arr[i + 2]);
            }
        }

        if (result == 0)
            result = -1;

        sb.append(result);
    }
}
