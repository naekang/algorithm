import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                max = Math.max(max, map[i][j]);
                min = Math.min(min, map[i][j]);
            }
        }

        int ansTime = Integer.MAX_VALUE;
        int ansHeight = -1;

        for (int i = min; i <= max; i++) {
            int time = 0;
            int height = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int gap = map[j][k] - i;

                    if (gap > 0) {
                        time += Math.abs(gap) * 2;
                        height += Math.abs(gap);
                    } else if (gap < 0) {
                        time += Math.abs(gap);
                        height -= Math.abs(gap);
                    }
                }
            }
            if (height >= 0) {
                if (time <= ansTime) {
                    ansTime = time;
                    ansHeight = i;
                }
            }
        }
        System.out.println(ansTime + " " + ansHeight);
    }
}
