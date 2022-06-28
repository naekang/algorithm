package javaalgo.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level1_핸드폰_번호_가리기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    public static String solution(String phone_number) {
        int replaceLength = phone_number.length();
        String tmp = phone_number.substring(0, replaceLength - 4).replaceAll("\\d", "*");

        return tmp + phone_number.substring(replaceLength - 4, replaceLength);
    }
}
