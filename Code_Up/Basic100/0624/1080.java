import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (true) {
            for (i = 0; i <= N; i++) {
                sum += i;
                if (sum >= N) {
                    System.out.println(i);
                }
            }

        }
    }
}