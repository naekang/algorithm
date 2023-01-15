package javaalgo.haulzzang.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Score[] scores = new Score[N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                scores[i] = new Score(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            }
            Arrays.sort(scores);

            int ans = 1;
            int min = scores[0].interview;
            for (int i = 1; i < N; i++) {
                if (scores[i].interview < min) {
                    ans++;
                    min = scores[i].interview;
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.println(sb.toString());
    }

    static class Score implements Comparable<Score> {

        int paper;
        int interview;

        public Score(int paper, int interview) {
            this.paper = paper;
            this.interview = interview;
        }

        @Override
        public int compareTo(Score o) {
            if (this.paper > o.paper) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
