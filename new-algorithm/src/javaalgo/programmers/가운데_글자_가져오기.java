package javaalgo.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }

    static String solution(String s) {
        int mid = s.length() / 2;

        return s.length() % 2 == 0 ? s.substring(mid - 1, mid + 1) :s.substring(mid, mid + 1);
    }
}
