package javaalgo.haulzzang.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj14235 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while (n-- > 0) {
            String input = br.readLine();

            if (input.equals("0") && pq.isEmpty()) {
                sb.append(-1).append('\n');
            } else if (input.equals("0") && !pq.isEmpty()){
                sb.append(pq.poll()).append('\n');
            } else {
                StringTokenizer st = new StringTokenizer(input);

                int cnt = Integer.parseInt(st.nextToken());

                for (int i = 0; i < cnt; i++) {
                    pq.offer(Integer.parseInt(st.nextToken()));
                }
            }
        }

        System.out.println(sb.toString());
    }

}
