package javaalgo.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 단속카메라 {
    public static void main(String[] args) {
        int[][] routes = {{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};

        System.out.println(solution(routes));
    }

    static int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);

        int cnt = 0;
        int cam = Integer.MIN_VALUE;

        for (int[] route : routes) {
            if (cam < route[0]) {
                cam = route[1];
                cnt++;
            }
        }

        return cnt;
    }
}
