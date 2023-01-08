package javaalgo.haulzzang.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj5014 {

    static int F, S, G, U, D;
    static int[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        map = new int[F + 1];

        System.out.println(bfs(S));
    }

    static String bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        map[start] = 1;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (cur == G) {
                return String.valueOf(map[cur] - 1);
            }

            if (cur + U <= F) {
                if (map[cur + U] == 0) {
                    map[cur + U] = map[cur] + 1;
                    queue.add(cur + U);
                }
            }

            if (cur - D > 0) {
                if (map[cur - D] == 0) {
                    map[cur - D] = map[cur] + 1;
                    queue.add(cur - D);
                }
            }
        }

        return "use the stairs";
    }
}
