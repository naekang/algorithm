import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1992 {

    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        partition(0, 0, N);
        System.out.println(sb);
    }

    static void partition(int x, int y, int size) {
        if (check(x, y, size)) {
            sb.append(arr[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');
        partition(x, y, newSize);
        partition(x, y + newSize, newSize);
        partition(x + newSize, y, newSize);
        partition(x + newSize, y + newSize, newSize);
        sb.append(')');
    }

    static boolean check(int x, int y, int size) {
        int val = arr[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (val != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
