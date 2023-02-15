package javaalgo.haulzzang.week20;

public class prms_피보나치_수 {

    public static void main(String[] args) {
        int n1 = 3;
        System.out.println(solution(n1));

        int n2 = 5;
        System.out.println(solution(n2));
    }

    static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}
