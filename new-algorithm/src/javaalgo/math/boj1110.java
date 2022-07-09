package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(cal(N));
    }

    static int cal(int num) {
        int cnt = 0;

        if (num < 10) {
            num *= 10;
        }

        int tmp = num;

        while (true) {

            num = (num / 10 + num % 10) % 10 + (num % 10) * 10;
            cnt++;

            if (num == tmp) break;
        }

        return cnt;
    }
}
