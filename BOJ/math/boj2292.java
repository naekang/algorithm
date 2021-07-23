import java.util.Scanner;

public class boj2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int floor = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (6 * floor);
                floor++;
            }
            System.out.println(floor);
        }
    }
}
