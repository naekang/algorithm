import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}