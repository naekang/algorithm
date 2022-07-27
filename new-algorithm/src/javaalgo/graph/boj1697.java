package javaalgo.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1697 {

    static int N, K;
    static int[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[100001];
        visited = new boolean[100001];

        bfs(N);

        System.out.println(map[K]);
    }

    static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(x);
        visited[x] = true;

        while (!queue.isEmpty()) {
            int a = queue.poll();

            if (a - 1 >= 0 && !visited[a - 1]) {
                visited[a - 1] = true;
                map[a - 1] = map[a] + 1;
                queue.add(a - 1);
            }

            if (a + 1 < 100001 && !visited[a + 1]) {
                visited[a + 1] = true;
                map[a + 1] = map[a] + 1;
                queue.add(a + 1);
            }

            if (a * 2 < 100001 && !visited[a * 2]) {
                visited[a * 2] = true;
                map[a * 2] = map[a] + 1;
                queue.add(a * 2);
            }
        }
    }
}
