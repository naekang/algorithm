import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int memberNum = 5;
        int[] score = new int[memberNum];
        int cnt = 0;

        for (int i = 0; i < memberNum; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j++) {
                score[i] += Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < 5; i++) {
            if (score[cnt] < score[i]) {
                cnt = i;
            }
        }

        System.out.println((cnt + 1) + " " + score[cnt]);
    }
}
