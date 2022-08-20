package javaalgo.programmers;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }

    static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (i == 0) {
                map.put(clothes[i][1], 1);
            } else {
                if (map.containsKey(clothes[i][1])) {
                    map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
                } else {
                    map.put(clothes[i][1], 1);
                }
            }
        }

        System.out.println(map.toString());

        int ans = 1;
        for (Integer i : map.values()) {
            ans *= (i + 1);
        }

        return ans - 1;
    }
}
