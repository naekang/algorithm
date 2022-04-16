import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5533 {

    static int N;
    static int[][] score;
    static int[] ans;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        score = new int[N][3];
        ans = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            score[i][0] = Integer.parseInt(st.nextToken());
            score[i][1] = Integer.parseInt(st.nextToken());
            score[i][2] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                boolean check = true;

                for (int k = 0; k < N; k++) {
                    if (i == k) continue;

                    if (score[i][j] == score[k][j]) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    ans[i] += score[i][j];
                }
            }
        }

        for (int num : ans) {
            sb.append(num).append('\n');
        }

        System.out.println(sb.toString());
    }

}
