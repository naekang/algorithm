import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int N = sc.nextInt();

        do {
            System.out.println(start);
            start += 1;
        } while (start <= N);

    }
}