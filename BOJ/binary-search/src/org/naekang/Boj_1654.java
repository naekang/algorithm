package org.naekang;

import java.util.Scanner;

public class Boj_1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        long N = sc.nextLong();
        long[] arr = new long[K];
        long high = 0;
        long low = 1;

        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextLong();
            high = Math.max(high, arr[i]);
        }


        while (low <= high) {
            long cnt = 0;
            long mid = (low + high) / 2;
            for (int i = 0; i < K; i++) {
                cnt += (arr[i] / mid);
            }
            if (cnt >= N) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(high);
    }
}
