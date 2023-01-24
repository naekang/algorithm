package javaalgo.haulzzang.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj22945 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int left = 0;
        int right = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            max = Math.max(Math.min(arr[left], arr[right]) * (right - left - 1), max);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(max);
    }
}
