package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0) break;

            if (Math.pow(C, 2) - (Math.pow(B, 2) + Math.pow(A, 2)) == 0) {
                sb.append("right").append('\n');
            } else if (Math.pow(B, 2) - (Math.pow(C, 2) + Math.pow(A, 2)) == 0) {
                sb.append("right").append('\n');
            } else if (Math.pow(A, 2) - (Math.pow(B, 2) + Math.pow(C, 2)) == 0) {
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }

        System.out.println(sb);

    }
}
