package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            printStar(N, i);
        }

        for (int i = N - 1; i > 0; i--) {
            printStar(N, i);
        }
    }

    private static void printStar(int n, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < 2 * (n - i); j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
