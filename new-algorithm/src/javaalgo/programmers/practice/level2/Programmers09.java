package javaalgo.programmers.practice.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmers09 {

    public static void main(String[] args) {
        String[] orders1 = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course1 = {2, 3, 4};

        System.out.println(Arrays.toString(solution(orders1, course1)));

        String[] orders2 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course2 = {2, 3, 5};

        System.out.println(Arrays.toString(solution(orders2, course2)));

        String[] orders3 = {"XYZ", "XWY", "WXA"};
        int[] course3 = {2, 3, 4};

        System.out.println(Arrays.toString(solution(orders3, course3)));
    }

    static Map<String, Integer> map = new HashMap<>();
    static List<String> answer = new ArrayList<>();

    static String[] solution(String[] orders, int[] course) {
        for (int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();

            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }

        for (int courseLen : course) {
            for (String order : orders) {
                comb("", order, courseLen);
            }

            if (!map.isEmpty()) {
                int max = map.values().stream().mapToInt(i -> i).max().getAsInt();

                if (max > 1) {
                    for (String key : map.keySet()) {
                        if (map.get(key) == max) {
                            answer.add(key);
                        }
                    }
                }
                map.clear();
            }
        }

        Collections.sort(answer);

        return answer.toArray(String[]::new);
    }

    static void comb(String startStr, String others, int cnt) {
        if (cnt == 0) {
            map.put(startStr, map.getOrDefault(startStr, 0) + 1);
            return;
        }

        for (int i = 0; i < others.length(); i++) {
            comb(startStr + others.charAt(i), others.substring(i + 1), cnt - 1);
        }
    }
}
