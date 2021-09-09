import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[1001];
        int sum = 0;
        int cnt = 1;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (cnt == 1001)
                    break;
                arr[cnt] = i;
                cnt++;
            }
        }

        for (int i = A; i <= B; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
