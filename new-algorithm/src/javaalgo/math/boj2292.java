package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range += 6 * cnt;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
