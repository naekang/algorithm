package javaalgo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2630 {

    static int N;
    static int whiteCnt = 0;
    static int blueCnt = 0;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divideConquer(0, 0, N);

        System.out.println(whiteCnt);
        System.out.println(blueCnt);
    }

    static void divideConquer(int r, int c, int size) {
        if (check(r, c, size)) {
            if (map[r][c] == 0) whiteCnt++;
            else blueCnt++;
            return;
        }

        int newSize = size / 2;

        divideConquer(r, c, newSize);
        divideConquer(r, c + newSize, newSize);
        divideConquer(r + newSize, c, newSize);
        divideConquer(r + newSize, c + newSize, newSize);
    }

    static boolean check(int r, int c, int size) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (map[i][j] != map[r][c]) return false;
            }
        }

        return true;
    }
}
