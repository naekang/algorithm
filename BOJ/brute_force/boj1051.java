import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1051 {

    static int N, M;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
    }

    static void pro() {
        int ans = 1;

        for (int k = 2; k <= Math.min(N, M); k++) {
            for (int i = 0; i < N - k + 1; i++) {
                for (int j = 0; j < M - k + 1; j++) {
                    if (arr[i][j] == arr[i][j + k - 1] && arr[i][j] == arr[i + k - 1][j] && arr[i][j] == arr[i + k - 1][j + k - 1]) {
                        if (ans < k) {
                            ans = k;
                        }
                    }
                }
            }
        }

        System.out.println(ans * ans);
    }
}
