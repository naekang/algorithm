package javaalgo.haulzzang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2805 {

    static int N, M;
    static int left = 0;
    static int right = Integer.MIN_VALUE;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {

        while (left <= right) {
            int mid = (left + right) / 2;

            long sum = Arrays.stream(arr).filter(i -> i > mid).mapToLong(i -> i - mid).sum();

             if (sum >= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, arr[i]);
        }
    }
}
