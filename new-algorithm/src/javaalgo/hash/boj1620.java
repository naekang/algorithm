package javaalgo.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> numMap = new HashMap<>();
        HashMap<String, Integer> strMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            numMap.put(i, str);
            strMap.put(str, i);
        }

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            if (line.matches("[0-9]*")) {
                sb.append(numMap.get(Integer.parseInt(line))).append('\n');
            } else {
                sb.append(strMap.get(line)).append('\n');
            }
        }

        System.out.println(sb.toString());
    }
}
