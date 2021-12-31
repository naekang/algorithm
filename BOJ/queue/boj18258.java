import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {

                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "pop":
                    Integer num = q.poll();

                    if (num == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(num).append("\n");
                    }
                    break;

                case "empty":
                    if (q.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    Integer numFirst = q.peek();

                    if (numFirst == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(numFirst).append("\n");
                    }
                    break;

                case "back":
                    Integer numBack = q.peekLast();

                    if (numBack == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(numBack).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}
