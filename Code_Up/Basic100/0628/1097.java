import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        int x, y;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();

            for (int j = 0; j < arr.length; j++) {
                if (arr[x - 1][j] == 0) {
                    arr[x - 1][j] = 1;
                } else {
                    arr[x - 1][j] = 0;
                }
            }

            y = sc.nextInt();

            for (int k = 0; k < arr.length; k++) {
                if (arr[k][y - 1] == 0) {
                    arr[k][y - 1] = 1;
                } else {
                    arr[k][y - 1] = 0;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}