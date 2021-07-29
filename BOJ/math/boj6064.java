import java.util.Scanner;

public class boj6064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int lcm = M * N / gcd(M, N);
            int n = 0;
            int result = -1;

            while (n * M < lcm) {
                if ((n * M + x - y) % N == 0) {
                    result = n * M + x;
                    break;
                }
                n++;
            }
            System.out.println(result);
        }
    }


    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
