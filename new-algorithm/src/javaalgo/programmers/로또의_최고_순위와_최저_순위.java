package javaalgo.programmers;

import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] lottos1 = {0, 0, 0, 0, 0, 0};
        int[] win_nums1 = {38, 19, 20, 40, 15, 25};

        int[] lottos2 = {45, 4, 35, 20, 3, 9};
        int[] win_nums2 = {20, 9, 3, 45, 4, 35};

        int[] lottos3 = {1, 2, 3, 4, 5, 6};
        int[] win_nums3 = {7, 8, 9, 10, 11, 12};

        int[] answer = solution(lottos3, win_nums3);

        System.out.println(Arrays.toString(answer));
    }

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int hiddenNum = (int) Arrays.stream(lottos).filter(i -> i == 0).count();

        int cnt = 0;
        for (int lotto : lottos) {
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    cnt++;
                }
            }
        }

        answer[0] = Math.min(7 - (cnt + hiddenNum), 6);
        answer[1] = 7 - cnt < 7 ? 7 - cnt : 6;

        return answer;
    }
}
