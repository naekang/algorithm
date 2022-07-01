package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


// stack을 활용한 방법도 존재
public class boj11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine().strip();

            if (str.equals("END")) break;

            sb.append(new StringBuilder(str).reverse()).append('\n');

        }
        System.out.println(sb);
    }
}
