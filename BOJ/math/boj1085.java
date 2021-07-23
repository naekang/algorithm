import java.util.Scanner;

public class boj1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int x_min = Math.min(x, w - x);
        int y_min = Math.min(y, h - y);

        System.out.println(Math.min(x_min, y_min));
    }
}
