package javaalgo.haulzzang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2110 {

    static int N, C;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {
        int ans = 0;
        int left = 1;
        int right = arr[N - 1] - arr[0];

        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 1;
            int start = arr[0];
            for (int i = 0; i < N; i++) {
                if (arr[i] - start >= mid) {
                    cnt++;
                    start = arr[i];
                }
            }

            if (cnt >= C) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
    }
}
