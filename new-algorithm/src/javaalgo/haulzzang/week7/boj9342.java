package javaalgo.haulzzang.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9342 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();

            sb.append(checkStr(str) ? "Infected!" : "Good").append('\n');
        }

        System.out.println(sb.toString());
    }

    static boolean checkStr(String s) {
        return s.matches("^[A-F]?A+F+C+[A-F]?$");
    }

}
