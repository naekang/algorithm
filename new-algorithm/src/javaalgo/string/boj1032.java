package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[] standard = br.readLine().toCharArray();

        for (int i = 0; i < N - 1; i++) {
            char[] input = br.readLine().toCharArray();

            for (int j = 0; j < standard.length; j++) {
                if (standard[j] != input[j]) {
                    standard[j] = '?';
                }
            }
        }

        System.out.println(standard);
    }
}
