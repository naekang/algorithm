package javaalgo.haulzzang.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj2696 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int M = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

            sb.append((M + 1) / 2).append('\n');

            int cnt = 0;

            for (int i = 0; i < M; i++) {
                if (i % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }

                int num = Integer.parseInt(st.nextToken());

                if (minHeap.size() == maxHeap.size()) {
                    maxHeap.offer(num);
                } else {
                    minHeap.offer(num);
                }

                if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
                    if (maxHeap.peek() > minHeap.peek()) {
                        int tmp = minHeap.poll();
                        minHeap.offer(maxHeap.poll());
                        maxHeap.offer(tmp);
                    }
                }

                if (i % 2 == 0) {
                    if (cnt == 9 || i == M - 1) {
                        sb.append(maxHeap.peek()).append('\n');
                        cnt = 0;
                    } else {
                        sb.append(maxHeap.peek()).append(' ');
                    }
                    cnt++;
                }
            }
        }

        System.out.println(sb.toString());
    }

}
