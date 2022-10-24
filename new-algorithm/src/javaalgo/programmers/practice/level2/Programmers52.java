package javaalgo.programmers.practice.level2;

public class Programmers52 {
    public static void main(String[] args) {
        String s1 = "3people unFollowed me";
        String s2 = "for the last week";

        System.out.println(solution(s1));
        System.out.println(solution(s2));

    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.toLowerCase().split("");

        boolean flag = true;
        for (String value : arr) {
            sb.append(flag ? value.toUpperCase() : value);

            flag = value.equals(" ");
        }

        return sb.toString();
    }
}
