package javaalgo.haulzzang.week20;

import java.util.LinkedList;
import java.util.Queue;

public class prms_숫자_변환하기 {

    public static void main(String[] args) {
        prms_숫자_변환하기 sol = new prms_숫자_변환하기();

        int x1 = 10;
        int y1 = 40;
        int n1 = 5;
        System.out.println(sol.solution(x1, y1, n1));

        int x2 = 10;
        int y2 = 40;
        int n2 = 30;
        System.out.println(sol.solution(x2, y2, n2));

        int x3 = 2;
        int y3 = 5;
        int n3 = 4;
        System.out.println(sol.solution(x3, y3, n3));
    }

    static int[] map;
    static boolean[] visited;

    public int solution(int x, int y, int n) {
        map = new int[y + 1];
        visited = new boolean[y + 1];

        bfs(x, n, y);

        return map[y] == 0 ? -1 : map[y];
    }

    static void bfs(int start, int n, int y) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (cur + n >= 0 && cur + n <= y) {
                if (!visited[cur + n] && map[cur + n] == 0) {
                    queue.add(cur + n);
                    map[cur + n] = map[cur] + 1;
                    visited[cur + n] = true;
                }
            }

            if (cur * 2 >= 0 && cur * 2 <= y) {
                if (!visited[cur * 2] && map[cur * 2] == 0) {
                    queue.add(cur * 2);
                    map[cur * 2] = map[cur] + 1;
                    visited[cur * 2] = true;
                }
            }

            if (cur * 3 >= 0 && cur * 3 <= y) {
                if (!visited[cur * 3] && map[cur * 3] == 0) {
                    queue.add(cur * 3);
                    map[cur * 3] = map[cur] + 1;
                    visited[cur * 3] = true;
                }
            }
        }
    }
}
