package javaalgo.haulzzang.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj13335 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Queue<Integer> truck = new LinkedList<>();
        Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(truck::add);

        int ans = 0;
        int weight = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            queue.add(0);
        }

        while (!queue.isEmpty()) {
            ans++;
            weight -= queue.poll();
            if (!truck.isEmpty()) {
                if (truck.peek() + weight <= L) {
                    weight += truck.peek();
                    queue.add(truck.poll());
                } else {
                    queue.add(0);
                }
            }
        }

        System.out.println(ans);
    }
}
