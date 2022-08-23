package javaalgo.programmers;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board, moves));
    }

    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]);
                    } else {
                        if (stack.peek() == board[j][move - 1]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(board[j][move - 1]);
                        }
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
