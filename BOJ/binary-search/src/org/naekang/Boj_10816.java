package org.naekang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Boj_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] str;

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        str =  br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            int key = Integer.parseInt(str[i]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        str =  br.readLine().split(" ");
        for (int i = 0; i < M; ++i) {
            int key = Integer.parseInt(str[i]);
            if (map.containsKey(key)) {
                sb.append(map.get(key)).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }

        System.out.println(sb);
    }
}
