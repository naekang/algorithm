package javaalgo.programmers;

import java.util.HashMap;
import java.util.Map;

public class 성격_유형_검사하기 {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        String[] survey1 = {"TR", "RT", "TR"};
        int[] choices1 = {7, 1, 3};

        System.out.println(solution(survey, choices));
    }

    static String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] >= 4) {
                if (map.containsKey(survey[i].charAt(1))) {
                    map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + Math.abs(choices[i] - 4));
                } else {
                    map.put(survey[i].charAt(1), Math.abs(choices[i] - 4));
                }
            } else {
                if (map.containsKey(survey[i].charAt(0))) {
                    map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + Math.abs(choices[i] - 4));
                } else {
                    map.put(survey[i].charAt(0), Math.abs(choices[i] - 4));
                }
            }
        }

        sb.append(map.getOrDefault('R', 0) < map.getOrDefault('T', 0) ? 'T' : 'R');
        sb.append(map.getOrDefault('C', 0) < map.getOrDefault('F', 0) ? 'F' : 'C');
        sb.append(map.getOrDefault('J', 0) < map.getOrDefault('M', 0) ? 'M' : 'J');
        sb.append(map.getOrDefault('A', 0) < map.getOrDefault('N', 0) ? 'N' : 'A');


        return sb.toString();
    }
}
