import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        int ans = 0;

        Arrays.fill(arr, -1);
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());

            if (arr[num] != loc && arr[num] != -1) {
                ans++;
            }
            arr[num] = loc;
        }
        System.out.println(ans);
    }
}
