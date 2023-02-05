package javaalgo.haulzzang.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj16953 {

    static long A, B;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(bfs(A));
    }

    static int bfs(long start) {
        Queue<Long> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                long cur = queue.poll();

                if (cur == B) {
                    return cnt + 1;
                }

                if (cur * 2 <= B) {
                    queue.add(cur * 2);
                }

                if (cur * 10 + 1 <= B) {
                    queue.add(cur * 10 + 1);
                }
            }
            cnt++;
        }

        return -1;
    }
}
