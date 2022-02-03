import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10974 {

    static int N;
    static int[] arr;
    static boolean[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        rec_func(0);
        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        selected = new boolean[N];
    }

    static void rec_func(int k) {
        if (k == N) {
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        }

        for (int i = 0; i < N; i++) {
            if (selected[i]) {
                continue;
            }
            arr[k] = i + 1;
            selected[i] = true;
            rec_func(k + 1);
            selected[i] = false;
        }
    }
}
