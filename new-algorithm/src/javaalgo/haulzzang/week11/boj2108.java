package javaalgo.haulzzang.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        sb.append(mean(arr)).append('\n')
            .append(median(arr)).append('\n')
            .append(mode(arr)).append('\n')
            .append(range(arr)).append('\n');

        System.out.println(sb.toString());
    }

    static int mean(int[] arr) {
        return (int) Math.round(Arrays.stream(arr).average().getAsDouble());
    }

    static int median(int[] arr) {
        return arr[arr.length / 2];
    }

    static int mode(int[] arr) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int mod = arr[0];
        boolean check = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }

            if (max < count) {
                max = count;
                mod = arr[i];
                check = true;
            } else if (max == count && check) {
                mod = arr[i];
                check = false;
            }
        }

        return mod;
    }

    static int range(int[] arr) {
        return arr[arr.length - 1] - arr[0];
    }
}
