package javaalgo.haulzzang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1654 {

    static int K, N;
    static int max, min;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {
        long left = 1;
        long right = max;

        long ans = right;
        while (left <= right) {
            long mid = (left + right) / 2;

            long sum = 0;

            for (int i = 0; i < K; i++) {
                sum += getCnt(arr[i], mid);
                if (sum > N) break;
            }

            if (sum >= N) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }

        return (int) ans;
    }

    static long getCnt(long x, long y) {
        return x / y;
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[K];

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
    }
}
