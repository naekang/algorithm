package javaalgo.haulzzang.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        String[] expArr = exp.split("-");

        int ans = 0;
        for (int i = 0; i < expArr.length; i++) {
            String s = expArr[i];
            int sum = 0;
            String[] nums = s.split("\\+");
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }

            if (i == 0) {
                ans += sum;
            } else {
                ans -= sum;
            }
        }

        System.out.println(ans);
    }
}
