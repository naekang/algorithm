package javaalgo.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 최대 힙(Max Heap): 부모 노드는 자식보다 큼 + 완전 이진 트리
// 최소 힙(Min Heap): 부모 노드는 자식보다 작음 + 완전 이진 트리
public class boj1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num != 0) {
                queue.add(num);
            } else if (queue.isEmpty()) {
                sb.append(0).append('\n');
            } else {
                sb.append(queue.poll()).append('\n');
            }
        }

        System.out.println(sb);
    }
}
