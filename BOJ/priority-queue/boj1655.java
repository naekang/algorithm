import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class boj1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (maxQueue.size() == minQueue.size()) {
                maxQueue.offer(num);

                if (!minQueue.isEmpty() && maxQueue.peek() > minQueue.peek()) {
                    minQueue.offer(maxQueue.poll());
                    maxQueue.offer(minQueue.poll());
                }
            } else {
                minQueue.offer(num);

                if (maxQueue.peek() > minQueue.peek()) {
                    minQueue.offer(maxQueue.poll());
                    maxQueue.offer(minQueue.poll());
                }
            }
            sb.append(maxQueue.peek()).append("\n");
        }

        System.out.println(sb);
    }
}
