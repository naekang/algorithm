package javaalgo.programmers.practice.unrank;

import java.util.Arrays;

public class Programmers01 {
    public static void main(String[] args) {
        int n1 = 3;
        long left1 = 2;
        long right1 = 5;

        System.out.println(Arrays.toString(solution(n1, left1, right1)));
    }

    static int[] solution(int n, long left, long right) {
        int len = (int) (right - left);
        int[] answer = new int[len + 1];

        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;

            answer[(int) (i - left)] = Math.max((int) row, (int) col) + 1;
        }

        return answer;
    }
}
