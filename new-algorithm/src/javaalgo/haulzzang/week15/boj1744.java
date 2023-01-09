package javaalgo.haulzzang.week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1744 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int ans = 0;

        int minusIdx = 0;
        int plusIdx = N - 1;

        while (minusIdx < N && arr[minusIdx] < 1) {
            if (minusIdx + 1 < N && arr[minusIdx + 1] < 1) {
                ans += (arr[minusIdx] * arr[minusIdx + 1]);
                minusIdx += 2;
            } else {
                ans += arr[minusIdx++];
            }
        }

        while (plusIdx >= minusIdx && arr[plusIdx] > 0) {
            if (plusIdx - 1 >= minusIdx && arr[plusIdx - 1] > 1) {
                ans += (arr[plusIdx] * arr[plusIdx - 1]);
                plusIdx -= 2;
            } else {
                ans += arr[plusIdx--];
            }
        }

        System.out.println(ans);
    }
}
