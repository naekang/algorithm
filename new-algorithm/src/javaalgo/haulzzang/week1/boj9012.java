package javaalgo.haulzzang.week1;

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

            sb.append(solution(str)).append('\n');
        }

        System.out.println(sb.toString());
    }

    static String solution(String s) {
        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') return "NO";

        int flag = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                flag++;
            } else {
                if (flag <= 0) return "NO";
                else flag--;
            }
        }

        if (flag == 0) return "YES";
        else return "NO";
    }
}
