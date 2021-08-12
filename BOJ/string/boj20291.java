import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class boj20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String title = str.substring(str.indexOf('.') + 1);

            if (map.containsKey(title)) {
                int nowCnt = map.get(title);
                map.replace(title, ++nowCnt);
            } else {
                map.put(title, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
