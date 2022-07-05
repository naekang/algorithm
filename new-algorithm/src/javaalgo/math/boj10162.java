package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int a = 0, b = 0, c = 0;

        while (T >= 10) {
            if (T >= 300) {
                T -= 300;
                a++;
            } else if (T >= 60) {
                T -= 60;
                b++;
            } else {
                T -= 10;
                c++;
            }
        }

        System.out.println(T == 0 ? a + " " + b + " " + c : -1);

    }
}
