import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int cnt = 1;

        for (int i = N - 1; i >= 0; i--) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int num : arr) {
            if (num > arr[0]) {
                cnt++;
                arr[0] = num;
            }
        }

        System.out.println(cnt);
    }
}
