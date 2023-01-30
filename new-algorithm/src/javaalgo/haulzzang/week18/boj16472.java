package javaalgo.haulzzang.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj16472 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] alpha = new int[26];

        int lo = 0;
        int hi = 0;
        int cnt = 0;
        int max = 0;
        alpha[str.charAt(0) - 'a']++;
        cnt++;

        while (true) {
            hi++;

            if (hi == str.length()) break;

            int idx = str.charAt(hi) - 'a';
            alpha[idx]++;

            if (alpha[idx] == 1) {
                cnt++;
            }

            while (cnt > N) {
                int num = str.charAt(lo) - 'a';
                alpha[num]--;

                if (alpha[num] == 0) {
                    cnt--;
                }
                lo++;
            }
            max = Math.max(max, hi - lo + 1);
        }

        System.out.println(max);
    }
}
