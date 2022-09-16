package javaalgo.programmers.practice.level2;

import java.util.Arrays;

public class Programmers25 {

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int[] citations1 = {12, 11, 10, 9, 8, 1};
        int[] citations2 = {4,4,4};
        int[] citations3 = {1, 4};
        int[] citations4 = {0, 1, 2};
//        System.out.println(solution(citations2));
//        System.out.println(solution(citations3));
        System.out.println(solution(citations4));
    }

    static int solution(int[] citations) {
        Arrays.sort(citations);

        int max = citations[citations.length - 1];

        for (int i = max; i >= 0; i--) {
            int idx = i;
            int cnt1 = (int) Arrays.stream(citations).filter(num -> num >= idx).count();
            int cnt2 = (int) Arrays.stream(citations).filter(num -> num <= idx).count();

            if (cnt1 >= i && cnt2 <= i) {
                return i;
            }
        }

        return 0;
    }

}
