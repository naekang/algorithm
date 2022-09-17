package javaalgo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2217 {

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static long solution() {
        Arrays.sort(arr);

        long max = 0;

        for (int i = N - 1; i >= 0; i--) {
            arr[i] *= (N - i);

            if (max < arr[i]) max = arr[i];
        }

        return max;
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }
}
