package javaalgo.haulzzang.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10974 {

    static int N;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];

        dfs(0);

        System.out.println(sb.toString());
    }

    static void dfs(int depth) {
        if (N == depth) {
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
