import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 6 == 0) {
                System.out.print("X");
                System.out.print(" ");
            } else {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}