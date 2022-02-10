import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj7795 {

    static int T, N, M;
    static int[] A, B;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            input();
            pro();
        }
        System.out.println(sb.toString());
    }

    static void input() throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N + 1];
        B = new int[M + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
    }

    static int lower_bound(int[] A, int L, int R, int X) {
        // A[L...R]에서 X 미만의 수(X 보다 작은 수) 중 제일 오른쪽 인덱스를 return 하는 함수
        // 그런게 없다면 L-1을 return
        int result = L - 1;
        while (L <= R) {
            int mid = (L + R) / 2;

            if (A[mid] < X) {
                result = mid;
                L = mid + 1;
            } else if (A[mid] >= X) {
                R = mid - 1;
            }
        }
        return result;
    }

    static void pro() {
        // B 배열에 대해 이분탐색을 할 예정이므로 정렬하기!
        Arrays.sort(B, 1, M + 1);

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            // A[i]를 선택했을 때, B에서는 A[i]보다 작은 수가 몇개나 있는지 count
            ans += lower_bound(B, 1, M, A[i]);
        }

        sb.append(ans).append('\n');
    }

}
