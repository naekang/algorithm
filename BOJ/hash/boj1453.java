import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        HashMap<Integer, Boolean> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int num = Integer.parseInt(st.nextToken());
            if (map.getOrDefault(num, false)) {
                cnt++;
            } else {
                map.put(num, true);
            }
        }

        System.out.println(cnt);
    }
}
