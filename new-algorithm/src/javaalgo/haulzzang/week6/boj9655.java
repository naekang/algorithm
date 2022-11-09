package javaalgo.haulzzang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(N % 2 == 1 ? "SK" : "CY");
    }

}
