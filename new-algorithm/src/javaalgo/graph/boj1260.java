package javaalgo.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1260 {

    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        visited = new boolean[1001];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        dfs(V);
        sb.append('\n');

        visited = new boolean[1001];
        bfs(V);

        System.out.println(sb);
    }

    static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");

        for (int i = 1; i <= N; i++) {
            if (arr[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            start = queue.poll();
            sb.append(start).append(" ");

            for (int i = 1; i <= N; i++) {
                if (!visited[i] && arr[start][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }
}
