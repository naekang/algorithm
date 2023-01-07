package javaalgo.haulzzang.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class boj7662 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());

            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());

                int num = 0;
                switch (st.nextToken()) {
                    case "I":
                        num = Integer.parseInt(st.nextToken());
                        map.put(num, map.getOrDefault(num, 0) + 1);
                        break;
                    case "D":
                        if (map.isEmpty()) {
                            break;
                        }

                        num = Integer.parseInt(st.nextToken());

                        if (num == 1) {
                            int maxKey = map.lastKey();
                            if (map.get(maxKey) == 1) {
                                map.remove(maxKey);
                            } else {
                                map.put(maxKey, map.get(maxKey) - 1);
                            }
                        } else if (num == -1) {
                            int minKey = map.firstKey();
                            if (map.get(minKey) == 1) {
                                map.remove(minKey);
                            } else {
                                map.put(minKey, map.get(minKey) - 1);
                            }
                        }
                        break;
                }
            }

            if (map.isEmpty()) {
                sb.append("EMPTY").append('\n');
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append('\n');
            }
        }

        System.out.println(sb.toString());
    }
}
