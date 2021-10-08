import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1780 {

    static int[][] arr;
    static int whiteCnt = 0;
    static int blackCnt = 0;
    static int grayCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        System.out.println(grayCnt);
        System.out.println(whiteCnt);
        System.out.println(blackCnt);
    }

    static void partition(int row, int col, int size) {
        if (check(row, col, size)) {
            if (arr[row][col] == -1) {
                grayCnt++;
            } else if (arr[row][col] == 0) {
                whiteCnt++;
            } else {
                blackCnt++;
            }
            return;
        }
        int newSize = size / 3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col+ 2 * newSize, newSize);

        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize, col + 2 * newSize, newSize);

        partition(row + 2 * newSize, col, newSize);
        partition(row + 2 * newSize, col + newSize, newSize);
        partition(row + 2 * newSize, col + 2 * newSize, newSize);
    }

    static boolean check(int row, int col, int size) {
        int color = arr[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
