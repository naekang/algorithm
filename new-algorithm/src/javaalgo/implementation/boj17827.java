package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj17827 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (M-- > 0) {
            int K = Integer.parseInt(br.readLine());

            sb.append(arr[findIdx(N, V, K)]).append('\n');
        }

        System.out.println(sb);
    }

    static int findIdx(int n, int v, int k) {
       if (k < n) return k;
       else if (k == n) return v - 1;
       else return (k - n) % (n - v + 1) + v - 1;
    }
}
