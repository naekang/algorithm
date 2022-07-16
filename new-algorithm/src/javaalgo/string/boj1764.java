package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        TreeMap<String, Integer> map = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (map.containsKey(str)) {
                map.put(str, 2);
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s) == 2) {
                list.add(s);
            }
        }

        sb.append(list.size()).append('\n');
        for (String s : list) {
            sb.append(s).append('\n');
        }


        System.out.println(sb);
    }
}
