import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];
        int N = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x - 1][y - 1] = 1;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; i < 10; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
