package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A == B) {
            if (B == C) {
                System.out.println(10000 + A * 1000);
            } else {
                System.out.println(1000 + A * 100);
            }
        } else {
            if (B == C) {
                System.out.println(1000 + B * 100);
            } else {
                if (A == C) {
                    System.out.println(1000 + A * 100);
                } else {
                    System.out.println(Math.max(Math.max(A, B), C) * 100);
                }
            }
        }
    }
}
