package javaalgo.programmers.practice.unrank;

import java.util.HashMap;
import java.util.Map;

public class Programmers02 {
    public static void main(String[] args) {
        String[] want1 = {"banana", "apple", "rice", "pork", "pot"};
        int[] number1 = {3, 2, 2, 2, 1};
        String[] discount1 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solution(want1, number1, discount1));

        String[] want2 = {"apple"};
        int[] number2 = {10};
        String[] discount2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        System.out.println(solution(want2, number2, discount2));
    }

    static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> newMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                newMap.put(discount[j], newMap.getOrDefault(discount[j], 0) + 1);
            }

            System.out.println(newMap);

            if (wantMap.equals(newMap)) answer++;
        }

        System.out.println(wantMap);

        return answer;
    }
}
