import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11497 {

    static int T, N;
    static int[] ans;
    static int[] arr;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;
            ans = new int[N];
            arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int start = 0;
            int end = N - 1;

            Arrays.sort(arr);

            for (int i = 0; i < N; i++) {
                if (i % 2 != 0) {
                    ans[start] = arr[i];
                    start++;
                } else {
                    ans[end] = arr[i];
                    end--;
                }
            }
            min = Math.abs(ans[0] - ans[N - 1]);
            for (int i = 1; i < N; i++) {
                min = Math.max(min, Math.abs(ans[i] - ans[i - 1]));
            }
            System.out.println(min);
        }
    }
}
