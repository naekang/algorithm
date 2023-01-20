package javaalgo.haulzzang.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class boj20920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.length() >= M) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort(((o1, o2) -> {
            int cnt1 = map.get(o1);
            int cnt2 = map.get(o2);

            if (cnt1 == cnt2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return cnt2 - cnt1;
        }));

        for (String s : list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb.toString());

    }
}
