import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2010 {

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void pro() {
        int sum = 0;
        int ans = 0;

        for (int num : arr) {
            sum += num;
        }

        ans = sum - arr.length + 1;

        System.out.println(ans);
    }
}
