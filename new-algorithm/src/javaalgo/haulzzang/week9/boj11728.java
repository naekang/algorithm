package javaalgo.haulzzang.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] aArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int aIdx = 0;
        int bIdx = 0;
        while (aIdx + bIdx < M + N) {
            if (aIdx == N) {
                sb.append(bArr[bIdx++]).append(' ');
            } else if (bIdx == M) {
                sb.append(aArr[aIdx++]).append(' ');
            } else {
                if (aArr[aIdx] > bArr[bIdx]) {
                    sb.append(bArr[bIdx++]).append(' ');
                } else {
                    sb.append(aArr[aIdx++]).append(' ');
                }
            }
        }

        System.out.println(sb.toString());

    }

}
