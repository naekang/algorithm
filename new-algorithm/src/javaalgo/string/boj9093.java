package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String[] str = br.readLine().split(" ");

            for (int i = 0; i < str.length; i++) {
                sb.append(reverse(str[i])).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
