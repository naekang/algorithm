import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5585 {

    static int[] arr = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int res = 1000 - N;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            while (res >= arr[i]) {
                res -= arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
