package javaalgo.programmers.practice.level2;

import java.util.Arrays;

public class Programmers31 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        System.out.println(Arrays.toString(solution(prices)));
    }

    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int cnt = 0;
            int num = prices[i];

            for (int j = i + 1; j < prices.length; j++) {
                if (num > prices[j]) {
                    cnt++;
                    break;
                } else {
                    cnt++;
                }
            }

            answer[i] = cnt;
        }

        return answer;
    }
}
