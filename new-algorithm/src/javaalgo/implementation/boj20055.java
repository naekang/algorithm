package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj20055 {

    static int N, K;
    static int[] belt;
    static boolean[] robot;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        belt = new int[N * 2];
        robot = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N * 2; i++) {
            belt[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;

        while (true) {
            rotate();
            cnt++;
            move();
            if (isEnd()) {
                System.out.println(cnt);
                break;
            }
        }
    }

    static void rotate() {
        int end = belt[N * 2 - 1];

        for (int i = N * 2 - 2; i >= 0; i--) {
            belt[i + 1] = belt[i];
        }
        belt[0] = end;

        for (int i = N - 2; i >= 0; i--) {
            robot[i + 1] = robot[i];
        }
        robot[0] = false;
    }

    static void move() {
        if (robot[N - 1]) {
            robot[N - 1] = false;
        }

        for (int i = N - 2; i > 0; i--) {
            if (robot[i] && !robot[i + 1] && belt[i + 1] > 0) {
                robot[i + 1] = true;
                robot[i] = false;
                belt[i + 1]--;
            }
        }

        if (belt[0] > 0 && !robot[0]) {
            robot[0] = true;
            belt[0]--;
        }
    }

    static boolean isEnd() {
        int cnt = 0;

        for (int i = 0; i < 2 * N; i++) {
            if (belt[i] == 0) {
                cnt++;
            }
        }

        return cnt >= K;
    }
}
