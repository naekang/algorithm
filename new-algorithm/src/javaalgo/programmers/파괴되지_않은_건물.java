package javaalgo.programmers;

import java.util.Arrays;

public class 파괴되지_않은_건물 {

    public static void main(String[] args) {
        int[][] board = {{5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}};
        int[][] skill = {{1, 0, 0, 3, 4, 4}, {1, 2, 0, 2, 3, 2}, {2, 1, 0, 3, 1, 2}, {1, 0, 1, 3, 3, 1}};

        System.out.println(solution(board, skill));

    }

    static int solution(int[][] board, int[][] skill) {
//        for (int i = 0; i < skill.length; i++) {
//            int type = skill[i][0];
//            int r1 = skill[i][1];
//            int c1 = skill[i][2];
//            int r2 = skill[i][3];
//            int c2 = skill[i][4];
//            int degree = skill[i][5];
//
//
//            for (int r = r1; r <= r2; r++) {
//                for (int c = c1; c <= c2; c++) {
//                    if (type == 1) {
//                        board[r][c] -= degree;
//                    } else if (type == 2) {
//                        board[r][c] += degree;
//                    }
//                }
//            }
//        }
//
//        int cnt = 0;
//        for (int[] ints : board) {
//            for (int anInt : ints) {
//                if (anInt > 0) cnt++;
//            }
//        }
//        return cnt;

        int[][] sum = new int[board.length + 1][board[0].length + 1];
        for (int[] value : skill) {
            int type = value[0];
            int r1 = value[1];
            int c1 = value[2];
            int r2 = value[3];
            int c2 = value[4];
            int degree = value[5] * (type == 1 ? -1 : 1);

            sum[r1][c1] += degree;
            sum[r1][c2 + 1] += (degree * -1);
            sum[r2 + 1][c1] += (degree * -1);
            sum[r2 + 1][c2 + 1] += degree;
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                sum[i][j] += sum[i - 1][j];
            }
        }

        for (int i = 1; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                sum[j][i] += sum[j][i - 1];
            }
        }


        int cnt = 0;

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(sum));

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] + sum[i][j] > 0) cnt++;
            }
        }

        return cnt;
    }

}
