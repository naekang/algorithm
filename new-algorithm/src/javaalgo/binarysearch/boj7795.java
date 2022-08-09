package javaalgo.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj7795 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            int[] B = new int[M + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }


            Arrays.sort(B);

            int ans = 0;
            for (int i = 1; i <= N; i++) {
                ans += search(B, 1, M, A[i]);
            }

            sb.append(ans).append('\n');
        }

        System.out.println(sb);

    }

    static int search(int[] arr, int L, int R, int X) {
        int result = L - 1;

        while (L <= R) {
            int mid = (L + R) / 2;

            if (arr[mid] < X) {
                result = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        return result;
    }
}
