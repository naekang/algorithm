package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(br.readLine());

        while (C-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            double avg = Arrays.stream(arr).average().getAsDouble();

            int upperAvg = (int) Arrays.stream(arr).filter(i -> i > avg).count();

            double ratio = (double) upperAvg / num * 100;

            sb.append(String.format("%.3f%%", ratio)).append('\n');
        }

        System.out.println(sb);
    }
}
