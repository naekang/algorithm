import java.util.Scanner;

public class boj2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int A = GCD(M, N);

        System.out.println(A);
        // 최소 공배수는 두 수의 곱을 최대 공약수로 나눈 값
        System.out.println(M * N / A);
    }

    // 최대공약수
    public static int GCD (int x, int y) {
        while (y != 0) {
            int z = x % y;

            x = y;
            y = z;
        }
        return x;
    }
}
