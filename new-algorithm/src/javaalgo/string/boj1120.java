package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int ans = A.length();

        for (int i = 0; i < B.length() - A.length() + 1; i++) {
            int cnt = 0;

            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(j + i)) {
                    cnt++;
                }
            }

            if (ans > cnt) {
                ans = cnt;
            }
        }

        System.out.println(ans);
    }
}
