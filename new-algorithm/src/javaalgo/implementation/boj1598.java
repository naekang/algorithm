package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int ax = A % 4 == 0 ? A / 4 : A / 4 + 1;
        int ay = A % 4 == 0 ? 4 : A % 4;

        int bx = B % 4 == 0 ? B / 4 : B / 4 + 1;
        int by = B % 4 == 0 ? 4 : B % 4;

        System.out.println(Math.abs(bx - ax) + Math.abs(by - ay));
    }
}
