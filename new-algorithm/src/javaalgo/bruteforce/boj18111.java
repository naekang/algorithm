package javaalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj18111 {

    static int N, M, B;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();

        solution(N, M, B, map);

        System.out.println(sb.toString());
    }

    static void solution(int N, int M, int B, int[][] map) {

        // TODO: 최소 최대값 갱신
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                min = Math.min(min, map[i][j]);
                max = Math.max(max, map[i][j]);
            }
        }

        int answerTime = Integer.MAX_VALUE;
        int answerHeight = 0;
        for (int h = min; h <= max; h++) {
            int time = 0;
            int inven = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {

                    if (h < map[i][j]) {
                        time += (Math.abs(map[i][j] - h) * 2);
                        inven += (map[i][j] - h);
                    } else if (h > map[i][j]) {
                        time += (h - map[i][j]);
                        inven -= (h - map[i][j]);
                    }
                }
            }

            if (inven >= 0) {
                if (time <= answerTime) {
                    answerTime = time;
                    answerHeight = h;
                }
            }
        }

        sb.append(answerTime).append(" ").append(answerHeight);
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
