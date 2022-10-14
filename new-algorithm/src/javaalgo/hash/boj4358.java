package javaalgo.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class boj4358 {

    static int cnt = 0;
    static Map<String, Integer> map;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static String solution() {

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(' ')
                    .append(String.format("%.4f", (double) map.get(entry.getKey()) / cnt * 100))
                    .append('\n');
        }

        return sb.toString();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new TreeMap<>();

        while (true){
            String str = br.readLine();

            if (str == null || str.length() == 0) break;

            cnt++;
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
    }
}
