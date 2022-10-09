package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int point = 0;
        int stick = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                point++;
            } else {
                point--;

                if (str.charAt(i - 1) == '(') {
                    stick += point;
                } else {
                    stick++;
                }
            }
        }

        System.out.println(stick);
    }
}
