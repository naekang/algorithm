package javaalgo.haulzzang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.StringTokenizer;

public class boj1969 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < M; i++) {
            Map<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < N; j++) {
                char ch = arr[j].charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            List<Entry<Character, Integer>> arrayList = new ArrayList<>(map.entrySet());

            arrayList.sort((o1, o2) -> {
                if (Objects.equals(o2.getValue(), o1.getValue())) {
                    return o1.getKey() - o2.getKey();
                }
                return o2.getValue() - o1.getValue();
            });

            sb.append(arrayList.get(0).getKey());
        }

        String target = sb.toString();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (target.charAt(j) != arr[i].charAt(j)) {
                    sum++;
                }
            }
        }

        System.out.println(target);
        System.out.println(sum);
    }

}
