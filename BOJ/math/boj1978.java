import java.util.Scanner;

public class boj1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int prime = 0;
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            int t = sc.nextInt();
            prime =0;

            for (int j = 1; j <= t; j++) {
                if (t % j == 0) {
                    prime++;
                }
            }
            if (prime == 2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
