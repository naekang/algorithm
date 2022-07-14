package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cntArr = new int[M];
        int tmp = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tmp = (tmp + Integer.parseInt(st.nextToken())) % M;
            cntArr[tmp]++;
        }

        long total = 0;
        for (int cnt : cntArr) {
            total += ((long) cnt * (cnt - 1) / 2);
        }

        System.out.println(total + cntArr[0]);
    }
}
