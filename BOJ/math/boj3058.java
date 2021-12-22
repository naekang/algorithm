import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            int ans = 0;

            for (int i = 0; i < 7; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) {
                    ans += num;
                    arr.add(num);
                }
            }
            Collections.sort(arr);
            sb.append(ans).append(" ").append(arr.get(0)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
