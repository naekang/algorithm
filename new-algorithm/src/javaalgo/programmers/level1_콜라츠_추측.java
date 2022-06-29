package javaalgo.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level1_콜라츠_추측 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }

    static int solution(long num) {
        int cnt = 0;

        while (num != 1) {

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            cnt++;

            if (cnt == 500) {
                cnt = -1;
                break;
            }
        }

        return cnt;
    }
}
