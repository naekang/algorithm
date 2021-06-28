import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[11][11];

        for (int i = 1; i < arr.length; i++) {
            String a = sc.nextLine();
            String[] b = a.split(" ");
            for (int j = 0; j < arr.length - 1; j++) {
                arr[i][j + 1] = Integer.parseInt(b[j]);
            }
        }

        int x = 2;
        int y = 2;

        while (true) {
            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }
            if (arr[x][y + 1] == 1) {
                if (arr[x + 1][y] == 1) {
                    break;
                } else {
                    x++;
                }
            } else if (arr[x][y + 1] != 1) {
                y++;
            }

            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }
            arr[x][y] = 9;
        }
        arr[2][2] = 9;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}