package javaalgo.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        long n = 118372;

        System.out.println(solution(n));
    }

    static long solution(long n) {
        String str = String.valueOf(n);

        return Long.parseLong(Arrays.stream(str.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }
}
