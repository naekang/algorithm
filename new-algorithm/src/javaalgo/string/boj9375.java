package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            int n = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();

                if (map.containsKey(type)) {
                    int num = map.get(type);
                    num++;
                    map.put(type, num);
                } else {
                    map.put(type, 1);
                }
            }

            int cnt = 1;
            for (String s : map.keySet()) {
                int num = map.get(s);
                cnt *= (num + 1);
            }

            sb.append(cnt - 1).append('\n');
        }

        System.out.println(sb);
    }
}
