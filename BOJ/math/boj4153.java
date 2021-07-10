import java.util.Scanner;

public class boj4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            if ((x * x + y * y) == (z * z)) {
                System.out.println("right");
            }  else if ((x * x + z * z) == (y * y)) {
                System.out.println("right");
            } else if ((z * z + y * y) == (x * x)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
