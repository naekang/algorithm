package javaalgo.haulzzang.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17179 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = new int[M + 1];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        arr[M] = L;

        while (N-- > 0) {
            int q = Integer.parseInt(br.readLine());
            int cnt = 0;

            int lo = 0;
            int hi = arr[M];
            while (lo <= hi) {
                int mid = (lo + hi) / 2;

                int cur = 0;
                int cut = 0;
                for (int i = 0; i <= M; i++) {
                    if (arr[i] >= cur + mid) {
                        cur = arr[i];
                        cut++;
                    }
                }

                if (cut > q) {
                    lo = mid + 1;
                    cnt = Math.max(cnt, mid);
                } else {
                    hi = mid - 1;
                }
            }

            System.out.println(cnt);
        }
    }
}
