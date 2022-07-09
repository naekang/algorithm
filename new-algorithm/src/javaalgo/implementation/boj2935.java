package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger A = new BigInteger(br.readLine());
        char operator = br.readLine().charAt(0);
        BigInteger B = new BigInteger(br.readLine());

        if (operator == '+') {
            System.out.println(A.add(B));
        } else {
            System.out.println(A.multiply(B));
        }
    }
}
