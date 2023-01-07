package javaalgo.haulzzang.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted()
            .toArray();

        int[] diffArr = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            diffArr[i] = arr[i + 1] - arr[i];
        }

        Arrays.sort(diffArr);

        int ans = 0;
        for (int i = N - K - 1; i >= 0; i--) {
            ans += diffArr[i];
        }

        System.out.println(ans);
    }
}
