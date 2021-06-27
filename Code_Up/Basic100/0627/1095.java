import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (i == 0) {
                min = num;
            } else if (min > num) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
