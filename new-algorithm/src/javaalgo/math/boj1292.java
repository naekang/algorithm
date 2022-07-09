package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[B];
        int idx = 0;
        for (int i = 1; i <= B; i++) {
            for (int j = 0; j < i; j++) {
                if (idx == B) break;
                arr[idx++] = i;
            }
        }

        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += arr[i];
        }

        System.out.println(sum);

    }
}
