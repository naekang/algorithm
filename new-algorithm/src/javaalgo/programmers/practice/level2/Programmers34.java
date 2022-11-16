package javaalgo.programmers.practice.level2;


import java.util.Arrays;

public class Programmers34 {

    public static void main(String[] args) {
        String s1 = "110010101001";
        System.out.println(Arrays.toString(solution(s1)));
    }

    static int[] solution(String s) {

        int removeCnt = 0;
        int cnt = 0;
        while (s.length() > 1) {
            int tmp = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '1') {
                    tmp++;
                } else {
                    removeCnt++;
                }
            }

            s = Integer.toBinaryString(tmp);
            cnt++;
        }

        int[] answer = new int[2];

        answer[0] = cnt;
        answer[1] = removeCnt;

        return answer;
    }

}
