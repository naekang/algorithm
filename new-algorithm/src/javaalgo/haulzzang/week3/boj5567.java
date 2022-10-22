package javaalgo.haulzzang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj5567 {

    static int n, m, ans = 0;
    static boolean[] visited;
    static List<Integer>[] adj;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static int solution() {
        bfs(1);

        for (int j : dist) {
            if (j > 0 && j <= 2) {
                ans++;
            }
        }
        return ans;
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int nx : adj[x]) {
                if (!visited[nx]) {
                    visited[nx] = true;
                    dist[nx] = dist[x] + 1;
                    queue.add(nx);
                }
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        dist = new int[n + 1];
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }
    }
}
