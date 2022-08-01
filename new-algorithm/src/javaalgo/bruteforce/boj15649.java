package javaalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15649 {

    static int N, M;
    static int[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new int[M + 1];

        recFunc(1);

        System.out.println(sb.toString());
    }

    static void recFunc(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(visited[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int cand = 1; cand <= N; cand++) {
                boolean isUsed = false;
                for (int i = 1; i < k; i++) {
                    if (cand == visited[i]) {
                        isUsed = true;
                    }
                }
                if (!isUsed) {
                    visited[k] = cand;
                    recFunc(k + 1);
                    visited[k] = 0;
                }
            }
        }
    }
}
