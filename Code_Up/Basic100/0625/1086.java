import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        long g = sc.nextLong();
        long b = sc.nextLong();

        double result = (r * g * b / 8 / Math.pow(2, 10) / Math.pow(2, 10));

        System.out.printf("%.2f MB", result);

    }
}