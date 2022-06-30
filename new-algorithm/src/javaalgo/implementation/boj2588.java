package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
//        String B = br.readLine();
//
//        System.out.println(A * Integer.parseInt(B.split("")[2]));
//        System.out.println(A * Integer.parseInt(B.split("")[1]));
//        System.out.println(A * Integer.parseInt(B.split("")[0]));
//        System.out.println(A * Integer.parseInt(B));

        System.out.println(A * (B % 10));
        System.out.println(A * ((B % 100)/ 10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);

    }
}
