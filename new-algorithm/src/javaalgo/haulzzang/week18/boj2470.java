package javaalgo.haulzzang.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2470 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int left = 0;
        int right = N - 1;
        int leftNum = 0;
        int rightNum = 0;
        int gap = Integer.MAX_VALUE;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int tmp = Math.abs(sum);
            if (tmp < gap) {
                gap = tmp;
                leftNum = arr[left];
                rightNum = arr[right];
            }

            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println(leftNum + " " + rightNum);
    }
}
