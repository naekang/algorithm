import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj13335 {

    static int n, w, L;
    static Queue<Integer> truck;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        truck = new LinkedList<>();
        queue = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            truck.offer(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < w; i++) {
            queue.offer(0);
        }
    }

    static void pro() {
        int time = 0;
        int totalWeight = 0;

        while (!queue.isEmpty()) {
            time++;
            totalWeight -= queue.poll();

            if (!truck.isEmpty()) {
                if (truck.peek() + totalWeight <= L) {
                    totalWeight += truck.peek();
                    queue.offer(truck.poll());
                } else {
                    queue.offer(0);
                }
            }
        }

        System.out.println(time);
    }

}
