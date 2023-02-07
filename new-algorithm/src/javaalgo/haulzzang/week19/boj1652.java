package javaalgo.haulzzang.week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] map = new char[N][N];

        for (int i = 0; i < N; i++) {
            char[] tmp = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = tmp[j];
            }
        }

        int A = 0;
        int B = 0;

        for (int i = 0; i < N; i++) {
            int h = 0, v = 0;
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '.') {
                    h++;
                }
                if (map[i][j] == 'X' || j == N - 1) {
                    if (h >= 2) {
                        A++;
                    }
                    h = 0;
                }

                if (map[j][i] == '.') {
                    v++;
                }
                if (map[j][i] == 'X' || j == N - 1) {
                    if (v >= 2) {
                        B++;
                    }
                    v = 0;
                }
            }
        }


        System.out.println(A + " " + B);
    }
}
