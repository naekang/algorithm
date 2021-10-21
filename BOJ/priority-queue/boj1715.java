import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class boj1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.add(Long.parseLong(br.readLine()));
        }

        long ans = 0;
        while (pq.size() > 1) {
            long tmp1 = pq.poll();
            long tmp2 = pq.poll();

            ans += tmp1 + tmp2;
            pq.add(tmp1 + tmp2);
        }

        System.out.println(ans);
    }
}
