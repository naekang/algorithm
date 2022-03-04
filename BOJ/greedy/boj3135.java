import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3135 {

    static int A, B, N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void pro() {
        int min = Math.abs(A - B);

        for (int i = 0; i < N; i++) {
            min = Math.min(Math.abs(B - arr[i]) + 1, min);
        }

        System.out.println(min);
    }
}
