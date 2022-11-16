package javaalgo.haulzzang.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj19638 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < T; i++) {
            int num = pq.peek();

            if (num < H) {
                sb.append("YES").append('\n').append(i);
                System.out.println(sb.toString());
                System.exit(0);
            } else {
                pq.poll();
                pq.offer(num / 2 == 0 ? 1 : num / 2);
            }
        }

        if (pq.peek() >= H) {
            sb.append("NO").append('\n').append(pq.peek());
        } else {
            sb.append("YES").append('\n').append(T);
        }

        System.out.println(sb.toString());

    }

}
