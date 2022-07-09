package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            BigInteger num = new BigInteger(br.readLine());

            if (num.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
                sb.append("even").append("\n");
            } else {
                sb.append("odd").append("\n");
            }
        }

        System.out.println(sb);
    }
}
