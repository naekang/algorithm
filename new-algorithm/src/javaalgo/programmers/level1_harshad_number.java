package javaalgo.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level1_harshad_number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        System.out.println(solution(input));
    }

    public static boolean solution(int x) {
        boolean answer = true;

        char[] arr = Integer.toString(x).toCharArray();
        int sum = 0;
        for (char c : arr) {
            sum += Character.getNumericValue(c);
        }

        if (x % sum != 0) answer = false;

        return answer;
    }
}