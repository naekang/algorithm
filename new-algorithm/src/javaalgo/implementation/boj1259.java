package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) break;

            String reverseStr = new StringBuilder(str).reverse().toString();

            if (str.equals(reverseStr)) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }

        System.out.println(sb);
    }
}
