package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2566 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] map = new int[9][9];
        int[] answer = new int[2];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (max < map[i][j]){
                    max = Math.max(max, map[i][j]);
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        sb.append(max).append('\n');

        for (int i : answer) {
            sb.append(i + 1).append(" ");
        }

        System.out.println(sb.toString());
    }
}
