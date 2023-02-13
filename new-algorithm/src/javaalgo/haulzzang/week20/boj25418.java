package javaalgo.haulzzang.week20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj25418 {

    static int A, K;
    static int[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[K + 1];
        visited = new boolean[K + 1];

        bfs(A);

        System.out.println(map[K]);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (cur + 1 >= 0 && cur + 1 <= K) {
                if (!visited[cur + 1] && map[cur + 1] == 0) {
                    queue.add(cur + 1);
                    visited[cur + 1] = true;
                    map[cur + 1] = map[cur] + 1;
                }
            }

            if (cur * 2 >= 0 && cur * 2 <= K) {
                if (!visited[cur * 2] && map[cur * 2] == 0) {
                    queue.add(cur * 2);
                    visited[cur * 2] = true;
                    map[cur * 2] = map[cur] + 1;
                }
            }
        }
    }
}
