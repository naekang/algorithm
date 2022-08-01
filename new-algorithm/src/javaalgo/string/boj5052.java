package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj5052 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            N = Integer.parseInt(br.readLine());

            String[] strArr = new String[N];

            for (int i = 0; i < N; i++) {
                strArr[i] = br.readLine();
            }

            Arrays.sort(strArr);

            sb.append(solution(strArr) ? "YES" : "NO").append('\n');
        }

        System.out.println(sb);
    }

    static boolean solution(String[] arr) {
        for (int i = 0; i < N - 1; i++) {
            if (arr[i + 1].startsWith(arr[i])) {
                return false;
            }
        }
        return true;
    }
}
