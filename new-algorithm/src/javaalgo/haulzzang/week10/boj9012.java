package javaalgo.haulzzang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();

            sb.append(checkVps(str)).append('\n');
        }

        System.out.println(sb.toString());
    }

    static String checkVps(String s) {
        if (s.charAt(s.length() - 1) == '(') {
            return "NO";
        }

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }

            if (cnt < 0) {
                return "NO";
            }
        }

        return cnt == 0 ? "YES" : "NO";
    }
}
