package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 0;

        while (true) {
            if (X <= cnt + range) {
                if (cnt % 2 == 0) {
                    sb.append(X - range).append("/").append(cnt - (X - range - 1));
                    break;
                } else {
                    sb.append(cnt - (X - range - 1)).append("/").append(X - range);
                    break;
                }
            } else {
                range += cnt;
                cnt++;
            }
        }

        System.out.println(sb);
    }
}
