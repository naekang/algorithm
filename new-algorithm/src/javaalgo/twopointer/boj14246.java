package javaalgo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());

        System.out.println(solution(k, arr));

    }

    static long solution(int k, int[] arr) {
        int left = 0;
        int right = 0;
        int len = arr.length;
        int sum = arr[left];
        long cnt = 0;

        while (left < len) {
            while (right + 1 < len && sum + arr[right + 1] <= k) {
                sum += arr[right + 1];
                right++;
            }
            cnt += len - right - 1;
            sum -= arr[left];
            left++;
        }

        return cnt;
    }

    static long twoPointer(int k, int[] arr) {
        long[] tmp = new long[arr.length];

        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j <= i; j++) {
                tmp[i] += arr[j];
            }
        }

        long count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = 0;

            if (tmp[i] > k) {
                count++;
            }
            while (tmp[i] - tmp[idx] > k) {
                count++;
                idx++;
            }
        }

        return count;
    }
}
