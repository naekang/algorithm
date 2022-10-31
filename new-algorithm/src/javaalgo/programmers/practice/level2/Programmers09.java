package javaalgo.programmers.practice.level2;

import java.util.Arrays;

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

    static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        return answer;
    }
}
