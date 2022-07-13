package javaalgo.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int M = Integer.parseInt(br.readLine());
        int[] targetArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int target : targetArr) {
            sb.append(binaryResearch(arr, target)).append('\n');
        }

        System.out.println(sb);
    }

    static int binaryResearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                return 1;
            }
        }

        return 0;
    }
}
