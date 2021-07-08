import java.util.Scanner;

public class boj1018 {

    public static boolean[][] arr;
    public static int min = 8 * 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new boolean[N][M];

        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine().trim();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'B') {
                    arr[i][j] = false;
                } else {
                    arr[i][j] = true;
                }
            }
        }

        int row = N - 7;
        int col = M - 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sel(i, j);
            }
        }
        System.out.println(min);
    }

    public static void sel(int x, int y) {
        int endRow = x + 8;
        int endCol = y + 8;
        int cnt = 0;

        boolean first = arr[x][y];

        for (int i = x; i < endRow; i++) {
            for (int j = y; j < endCol; j++) {
                if (arr[i][j] != first)
                    cnt++;
                first = (!first);
            }
            first = (!first);
        }

        cnt = Math.min(cnt, 64 - cnt);

        min = Math.min(min, cnt);
    }
}
