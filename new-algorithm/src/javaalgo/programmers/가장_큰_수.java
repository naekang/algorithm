package javaalgo.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {
    public static void main(String[] args) {
        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};

        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
    }

    static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] number = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(number, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (number[0].equals("0")) return "0";

        for (String s : number) {
            sb.append(s);
        }

        return sb.toString();
    }
}
