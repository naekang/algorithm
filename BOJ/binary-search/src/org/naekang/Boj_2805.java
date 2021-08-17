package org.naekang;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;

        Arrays.sort(arr);

        int left = 1;
        int right = arr[N - 1];
        long height = 0;
        int mid = 0;
        int ans = 0;

        while (left <= right) {
            height = 0;
            mid = (left + right) / 2;

            for (int i = 0; i < N; i++) {
                if (arr[i] >= mid) {
                    height += (arr[i] - mid);
                }
            }

            if (height >= M) {
                left = mid + 1;
            } else if (height < M) {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
