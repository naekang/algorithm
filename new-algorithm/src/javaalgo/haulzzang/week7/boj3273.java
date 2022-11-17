package javaalgo.haulzzang.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int x = Integer.parseInt(br.readLine());

        int left = 0;
        int right = arr.length - 1;
        int ans = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
                ans++;
            }

            if (sum <= x) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(ans);
    }
}
