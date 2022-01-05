import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj9076 {

    private static final int MAX_LENGTH = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] score = new int[MAX_LENGTH];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < score.length; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(score);

            if (score[3] - score[1] >= 4) {
                sb.append("KIN").append("\n");
            } else {
                sb.append(score[1] + score[2] + score[3]).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
