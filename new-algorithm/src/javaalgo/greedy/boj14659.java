package javaalgo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) cnt++;
                else break;
            }
            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}
