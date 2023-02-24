package javaalgo.haulzzang.week21;

import java.util.Arrays;

public class prms_합승_택시_요금 {

    public static void main(String[] args) {
        prms_합승_택시_요금 sol = new prms_합승_택시_요금();

        int n1 = 6, s1 = 4, a1 = 6, b1 = 2;
        int[][] fares1 = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50},
            {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
        System.out.println(sol.solution(n1, s1, a1, b1, fares1));

        int n2 = 7, s2 = 3, a2 = 4, b2 = 1;
        int[][] fares2 = {{5,7,9}, {4,6,4}, {3,6,1}, {3,2,3}, {2,1,6}};
        System.out.println(sol.solution(n2, s2, a2, b2, fares2));
    }

    static final int INF = 20_000_001;

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
            dp[i][i] = 0;
        }

        for (int i = 0; i < fares.length; i++) {
            int start = fares[i][0];
            int end = fares[i][1];
            int fare = fares[i][2];

            dp[start][end] = fare;
            dp[end][start] = fare;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
            }
        }

        int answer = dp[s][a] + dp[s][b];

        for (int i = 1; i <= n; i++) {
            answer = Math.min(answer, dp[s][i] + dp[i][a] + dp[i][b]);
        }

        return answer;
    }
}
