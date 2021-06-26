import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        long result = a * m + d;

        if (n == 1) {
            System.out.println(a);
        } else {
            for (int i = 2; i < n; i++) {
                result = result * m + d;
            }
            System.out.println(result);
        }

    }
}