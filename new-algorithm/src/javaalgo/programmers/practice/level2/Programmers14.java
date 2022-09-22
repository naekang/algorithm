package javaalgo.programmers.practice.level2;

public class Programmers14 {
    public static void main(String[] args) {
        String name1 = "JEROEN";
        String name2 = "JAN";

        System.out.println(solution(name1));
        System.out.println(solution(name2));
    }

    static int solution(String name) {
        int answer = 0;
        int len = name.length();
        int mov = len - 1;
        for (int i = 0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            if (i < len - 1 && name.charAt(i + 1) == 'A') {
                int idx = i + 1;

                while (idx < len && name.charAt(idx) == 'A') {
                    idx++;
                }
                mov = Math.min(mov, i * 2 + (len - idx));
                mov = Math.min(mov, i + (len - idx) * 2);

            }
        }
        return mov + answer;
    }
}
