package javaalgo.haulzzang.week21;

import java.util.Arrays;
import java.util.Stack;

public class prms_뒤에_있는_큰_수_찾기 {

    public static void main(String[] args) {
        prms_뒤에_있는_큰_수_찾기 sol = new prms_뒤에_있는_큰_수_찾기();

        int[] numbers1 = {2, 3, 3, 5};
        System.out.println(Arrays.toString(sol.solution(numbers1)));

        int[] numbers2 = {9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(sol.solution(numbers2)));
    }

    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (stack.isEmpty() || numbers[i] < numbers[i - 1]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                    answer[stack.pop()] = numbers[i];
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}
