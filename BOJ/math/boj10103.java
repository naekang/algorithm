import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10103 {

    static int N;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solve(N, arr);
        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    static void solve(int n, int[][] score) {
        int resultA = 100;
        int resultB = 100;

        while (n-- > 0) {
            if (score[n][0] == score[n][1]) {
                continue;
            } else if (score[n][0] > score[n][1]) {
                resultB -= score[n][0];
            } else {
                resultA -= score[n][1];
            }
        }

        sb.append(resultA).append("\n").append(resultB);
    }
}
