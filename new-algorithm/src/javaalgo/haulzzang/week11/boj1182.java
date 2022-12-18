package javaalgo.haulzzang.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1182 {

    static int N, S, ans;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        backTracking(0, 0);

        System.out.println(S == 0 ? ans - 1 : ans);
    }

    static void backTracking(int depth, int sum) {
        if (depth == N) {
            if (sum == S) {
                ans++;
            }
            return;
        }

        backTracking(depth + 1, sum + arr[depth]);
        backTracking(depth + 1, sum);
    }
}
