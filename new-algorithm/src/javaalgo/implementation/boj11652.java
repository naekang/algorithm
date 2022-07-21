package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class boj11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();

        while (N-- > 0) {
            Long num = Long.parseLong(br.readLine());

            if (map.containsKey(num)) {
                int tmp = map.get(num);
                int tmpCnt = tmp + 1;
                map.put(num, tmpCnt);
            } else {
                map.put(num, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        long answer = 0;
        for (Long x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            } else if (map.get(x) == max) {
                answer = Math.min(answer, x);
            }
        }


        System.out.println(answer);
    }
}
