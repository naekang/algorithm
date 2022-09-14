package javaalgo.programmers.practice.level2;

public class Programmers00 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n10 = 10;

        System.out.println(solution(n1));
        System.out.println(solution(n2));
        System.out.println(solution(n3));
        System.out.println(solution(n4));
        System.out.println(solution(n10));
    }

    static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        String[] numArr = {"4", "1", "2"};

        while (n > 0) {
            int idx = n % 3;
            n /= 3;

            if (idx == 0) n--;

            sb.append(numArr[idx]);
        }

        return sb.reverse().toString();
    }
}
