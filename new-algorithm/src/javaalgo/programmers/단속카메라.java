package javaalgo.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 단속카메라 {
    public static void main(String[] args) {
        int[][] routes = {{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};

        System.out.println(solution(routes));
    }

    static int solution(int[][] routes) {
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        System.out.println(Arrays.deepToString(routes));

        int cnt = 0;

        for (int i = 0; i < routes.length - 1; i++) {
            if (routes[i][1] < routes[i + 1][0]) cnt++;
        }

        return cnt;
    }
}
