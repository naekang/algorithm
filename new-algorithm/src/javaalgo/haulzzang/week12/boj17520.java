package javaalgo.haulzzang.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj17520 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 1;
        int pow = n % 2 == 0 ? n / 2 : n / 2 + 1;
        for (int i = 0; i < pow; i++) {
            answer = (answer * 2) % 16769023;
        }

        System.out.println(answer);
    }
}
