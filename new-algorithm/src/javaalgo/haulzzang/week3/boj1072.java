package javaalgo.haulzzang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1072 {

    static int X, Y, Z;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {
        if (X == Y) return -1;

        int ans = -1;

        int left = 0;
        int right = 1_000_000_000;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (calPercent(X + mid, Y + mid) != Z) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    static int calPercent(int x, int y) {
        return (int) ((long) 100 * y / x);
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        Z = calPercent(X, Y);
    }
}
