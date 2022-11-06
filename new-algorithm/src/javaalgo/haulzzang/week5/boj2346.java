package javaalgo.haulzzang.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj2346 {

    static int N;
    static Deque<int[]> deque;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println(sb.toString());
    }

    static void solution() {
        int start = deque.pollFirst()[1];

        sb.append("1").append(" ");
        while (!deque.isEmpty()) {
            if (start > 0) {
                for (int i = 1; i < start; i++) {
                    deque.add(deque.poll());
                }

                int[] next = deque.poll();
                start = next[1];
                sb.append(next[0]).append(" ");
            } else {
                for (int i = 1; i < -start; i++) {
                    deque.addFirst(deque.pollLast());
                }

                int[] next = deque.pollLast();
                start = next[1];
                sb.append(next[0]).append(" ");
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            deque.add(new int[]{(i + 1), Integer.parseInt(st.nextToken())});
        }
    }
}
