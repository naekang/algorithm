import java.util.Scanner;

public class boj1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(cal(x1, y1, r1, x2, y2, r2));
        }
    }

    public static int cal(int x1, int y1, int r1, int x2, int y2, int r2) {
        int dis = (int) Math.pow(x2 - x1, 2) + (int) Math.pow(y2 - y1, 2);

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (dis > (int) Math.pow(r1 + r2, 2)) {
            return 0;
        } else if (dis < (int) Math.pow(r2 - r1, 2)) {
            return 0;
        } else if (dis == (int) Math.pow(r2 - r1, 2)) {
            return 1;
        } else if (dis == (int) Math.pow(r2 + r1, 2)) {
            return 1;
        } else {
            return 2;
        }
    }
}
