package javaalgo.haulzzang.week20;

public class prms_예상_대진표 {

    public static void main(String[] args) {
        int N = 8;
        int A = 4;
        int B = 7;

        System.out.println(solution(N, A, B));
    }

    static int solution(int n, int a, int b) {
        int ans = 0;

        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            ans++;
        }

        return ans;
    }
}
