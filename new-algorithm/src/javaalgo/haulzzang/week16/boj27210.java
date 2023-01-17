package javaalgo.haulzzang.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj27210 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int num = arr[i] == 1 ? 1 : -1;
            sum += num;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        sum = 0;
        for (int i = 0; i < N; i++) {
            int num = arr[i] == 1 ? -1 : 1;
            sum += num;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);
    }
}
