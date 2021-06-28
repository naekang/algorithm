import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] arr = new int[X + 1][Y + 1];

        int n = sc.nextInt();
        int l, d, x, y;

        for (int i = 0; i < n; i++) {
            l = sc.nextInt();
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            if (d == 0) {
                for (int j = 0; j < l; j++) {
                    arr[x][y + j] = 1;
                }
            } else if (d == 1) {
                for (int k = 0; k < l; k++) {
                    arr[x + j][y] = 1;
                }
            }
        }

        for (int i = 1; i <= X; i++) {
            for (int j = 1; j <= Y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}