package javaalgo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {

    public static void main(String[] args) {
        String s = "III";

        System.out.println(romanToInt(s));
    }

    static public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += map.get(s.charAt(i));
        }

        return sum;
    }

}
