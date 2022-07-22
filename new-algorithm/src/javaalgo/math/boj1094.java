package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int num = 64;
        int cnt = 0;
        while (X > 0) {
            if (X < num) {
                num /= 2;
            } else {
                cnt++;
                X -= num;
            }
        }

        System.out.println(cnt);
    }
}
