package javaalgo.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2644 {

    static int n, m, targetX, targetY;
    static ArrayList<Integer>[] adj;
    static int[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        targetX = Integer.parseInt(st.nextToken());
        targetY = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            adj[x].add(y);
            adj[y].add(x);
        }

        bfs(targetX - 1);

        System.out.println(map[targetY - 1]);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            map[i] = -1;
        }
        queue.add(start);
        map[start] = 0;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int y : adj[x]) {
                if (map[y] == -1) {
                    queue.add(y);
                    map[y] = map[x] + 1;
                }
            }
        }
    }
}
