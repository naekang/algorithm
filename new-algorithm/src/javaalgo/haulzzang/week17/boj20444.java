package javaalgo.haulzzang.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj20444 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long lo = 0;
        long hi = n / 2;

        while (lo <= hi) {
            long row = (lo + hi) / 2;
            long col = n - row;

            long sum = (row + 1) * (col + 1);
            if (sum == k) {
                System.out.println("YES");
                return;
            } else if (sum > k) {
                hi = row - 1;
            } else {
                lo = row + 1;
            }
        }

        System.out.println("NO");

    }
}
