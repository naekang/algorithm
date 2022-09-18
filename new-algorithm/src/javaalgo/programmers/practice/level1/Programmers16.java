package javaalgo.programmers.practice.level1;

import java.time.LocalDate;

public class Programmers16 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        System.out.println(solution(a, b));
    }

    static String solution(int a, int b) {
        return String.valueOf(LocalDate.of(2016, a, b).getDayOfWeek()).substring(0, 3);
    }
}
