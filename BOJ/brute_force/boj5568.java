import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class boj5568 {

    static int n, k;
    static int[] arr;
    static boolean[] selected;
    static HashSet<String> set;

    public static void main(String[] args) throws IOException {
        input();
        rec_func(0, "");
        System.out.println(set.size());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n];
        selected = new boolean[n];
        set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void rec_func(int cnt, String str) {
        if (cnt == k) {
            set.add(str);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (selected[i]) {
                continue;
            }
            selected[i] = true;
            rec_func(cnt + 1, str + arr[i]);
            selected[i] = false;
        }
    }

}
