package javaalgo.haulzzang.week20;

public class prms_숫자_카드_나누기 {

    public static void main(String[] args) {
        prms_숫자_카드_나누기 sol = new prms_숫자_카드_나누기();

        int[] arrayA1 = {10, 17};
        int[] arrayB1 = {5, 20};
        System.out.println(sol.solution(arrayA1, arrayB1));

        int[] arrayA2 = {10, 20};
        int[] arrayB2 = {5, 17};
        System.out.println(sol.solution(arrayA2, arrayB2));

        int[] arrayA3 = {14, 35, 119};
        int[] arrayB3 = {18, 30, 102};
        System.out.println(sol.solution(arrayA3, arrayB3));
    }

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        for (int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
            gcdB = gcd(gcdB, arrayB[i]);
        }

        if (checkDividable(arrayB, gcdA)) {
            if (answer < gcdA) {
                answer = gcdA;
            }
        }

        if (checkDividable(arrayA, gcdB)) {
            if (answer < gcdB) {
                answer = gcdB;
            }
        }
        return answer;
    }

    private static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }

    private static boolean checkDividable(int[] nums, int x) {
        for (int num : nums) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
