import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj1417 {

    static int N, tmp;
    static ArrayList<Integer> list;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        tmp = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
    }

    static void pro() {
        int ans = 0;

        if (N == 1) {
            System.out.println(0);
            return;
        }

        while (Collections.max(list) >= tmp) {
            int idx = list.indexOf(Collections.max(list));
            list.set(idx, list.get(idx) - 1);
            tmp++;
            ans++;
        }
        System.out.println(ans);
    }
}
