import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj2346 {

    static int N;
    static Deque<Balloon> deque;
    static StringBuilder sb = new StringBuilder();

    static class Balloon {
        int idx, num;

        public Balloon(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        deque = new ArrayDeque<Balloon>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            deque.add(new Balloon(i, Integer.parseInt(st.nextToken())));
        }
    }

    static void pro() {
        while (!deque.isEmpty()) {
            sb.append(deque.getFirst().idx).append(" ");

            int tmp = deque.poll().num;

            if (deque.isEmpty()) break;

            if (tmp > 0) {
                tmp--;
                for (int i = 0; i < tmp; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < (-1) * tmp; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString());
    }


}
