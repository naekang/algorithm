import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long sum = 0;

        for (int i = 1; i < 10000000; i++) {

            sum += i;

            if (sum >= a) {
                System.out.println(sum);
                break;
            }
        }

    }

}