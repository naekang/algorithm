package javaalgo.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class boj10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();

            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (int i = 0; i < N - 1; i++) {
            String name = br.readLine();

            if (map.get(name) == 1) {
                map.remove(name);
            } else {
                map.put(name, map.get(name) - 1);
            }
        }

        for (String str : map.keySet()) {
            sb.append(str).append('\n');
        }

        System.out.println(sb);

    }
}
