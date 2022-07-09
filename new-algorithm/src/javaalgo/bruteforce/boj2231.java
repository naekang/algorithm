package javaalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <= N; i++) {
            if (recur(i) == N) {
                System.out.println(i);
                break;
            } else if (i == N) {
                System.out.println(0);
            }
        }
    }

    static int recur(int num) {
        String str = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        return sum + Integer.parseInt(str);
    }
}
