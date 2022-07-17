package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        var map = new HashMap<String, Integer>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (map.containsKey(str)) {
                int num = map.get(str);
                num++;
                map.put(str, num);
            } else {
                map.put(str, 1);
            }
        }

        int max = map.values().stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new);

        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (String s : list) {
            if (map.get(s) == max) {
                System.out.println(s);
                break;
            }
        }
    }
}
