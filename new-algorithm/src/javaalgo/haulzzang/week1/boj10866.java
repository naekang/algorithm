package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class boj10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    if (deque.size() == 0) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(deque.pollFirst()).append('\n');
                    }
                    break;

                case "pop_back":
                    if (deque.size() == 0) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(deque.pollLast()).append('\n');
                    }
                    break;

                case "size":
                    sb.append(deque.size()).append('\n');
                    break;

                case "empty":
                    String result = deque.size() == 0 ? "1" : "0";
                    sb.append(result).append('\n');
                    break;

                case "front":
                    if (deque.size() == 0) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(deque.peekFirst()).append('\n');
                    }
                    break;

                case "back":
                    if (deque.size() == 0) {
                        sb.append("-1").append('\n');
                    } else {
                        sb.append(deque.peekLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
