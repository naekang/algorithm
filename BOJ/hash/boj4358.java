import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class boj4358 {

    static HashMap<String, Integer> map;
    static int sum;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new HashMap<>();
        sum = 0;

        while (true) {
            String str = br.readLine();

            if (str == null || str.length() == 0) break;

            sum++;
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
    }

    static void pro() {
        Object[] objects = map.keySet().toArray();
        Arrays.sort(objects);

        for (Object object : objects) {
            String str = String.valueOf(object);
            int cnt = map.get(str);
            double ans = (cnt * 100.0) / sum;

            sb.append(str).append(' ').append(String.format("%.4f", ans)).append('\n');
        }

        System.out.println(sb.toString());
    }
}
