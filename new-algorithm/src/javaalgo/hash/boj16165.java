package javaalgo.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class boj16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> map = new TreeMap<>();

        while (N-- > 0) {
            String team = br.readLine();
            int memberCnt = Integer.parseInt(br.readLine());

            while (memberCnt-- > 0) {
                map.put(br.readLine(), team);
            }
        }

        while (M-- > 0) {
            String ask = br.readLine();
            int type = Integer.parseInt(br.readLine());

            if (type == 0) {
                map.entrySet().stream().filter(entry -> entry.getValue().equals(ask))
                        .forEach(i -> sb.append(i.getKey()).append('\n'));
            } else {
                sb.append(map.get(ask)).append('\n');
            }
        }

        System.out.println(sb);
    }
}
