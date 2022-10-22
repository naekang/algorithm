package javaalgo.haulzzang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2512 {

    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {
        int left = 1;
        int right = arr[N - 1];

        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;

            for (int i = 0; i < N; i++) {
                sum += Math.min(arr[i], mid);
            }

            if (sum > M) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        M = Integer.parseInt(br.readLine());
    }
}
