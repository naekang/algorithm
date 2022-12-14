package javaalgo.haulzzang.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if (N % H == 0) {
                sb.append(H).append(String.format("%02d", N / H)).append('\n');
            } else {
                sb.append(N % H).append(String.format("%02d", N / H + 1)).append('\n');
            }
        }

        System.out.println(sb.toString());
    }
}
