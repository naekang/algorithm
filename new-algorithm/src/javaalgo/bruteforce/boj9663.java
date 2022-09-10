package javaalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9663 {

    static int N;

    public static void main(String[] args) throws IOException {
        input();

        System.out.println(solution(N));
    }

    /**
     * 퀸이 갈 수 있는 위치 -> 상 하 좌 우 + 대각선
     *
     *
     */
    static int solution(int N) {
        return 1;
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
    }
}
