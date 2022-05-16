import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1592 {

    static int N, M, L;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];

        int idx = 1;
        int ans = 0;

        while (true) {
            arr[idx]++;

            if (arr[idx] == M) break;

            if (arr[idx] % 2 == 0) {
                idx = (idx - L) > 0 ? (idx - L) : N - Math.abs(idx - L);
            } else {
                idx = (idx + L) > N ? (idx + L) % N : (idx + L);
            }
            ans++;
        }

        System.out.println(ans);
    }
}
