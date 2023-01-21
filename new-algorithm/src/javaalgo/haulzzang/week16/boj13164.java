package javaalgo.haulzzang.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj13164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] heights = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
            .toArray();

        int[] minusArr = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            minusArr[i] = heights[i + 1] - heights[i];
        }
        Arrays.sort(minusArr);

        int ans = 0;
        for (int i = 0; i < N - K; i++) {
            ans += minusArr[i];
        }

        System.out.println(ans);
    }
}
