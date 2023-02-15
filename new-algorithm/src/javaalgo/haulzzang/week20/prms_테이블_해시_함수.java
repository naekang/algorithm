package javaalgo.haulzzang.week20;

import java.util.Arrays;

public class prms_테이블_해시_함수 {

    public static void main(String[] args) {
        int[][] data1 = {{2, 2, 6}, {1, 5, 10}, {4, 2, 9}, {3, 8, 3}};
        int col1 = 2;
        int row_begin1 = 2;
        int row_end1 = 3;
        System.out.println(solution(data1, col1, row_begin1, row_end1));
    }

    static int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, (o1, o2) -> {
            if (o1[col - 1] == o2[col - 1]) {
                return o2[0] - o1[0];
            }
            return o1[col - 1] - o2[col - 1];
        });

        int ans = 0;
        for (int i = row_begin; i <= row_end; i++) {
            int mod = i;
            int sum = Arrays.stream(data[i - 1]).map(num -> num % mod).sum();
            ans ^= sum;
        }

        return ans;
    }
}
