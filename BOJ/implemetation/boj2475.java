import java.util.Scanner;

public class boj2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            ans += Math.pow(N, 2);
        }
        System.out.println(ans%10);
    }
}
