package javaalgo.haulzzang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String fun = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arrStr = br.readLine();

            sb.append(solution(fun, n, arrStr)).append('\n');
        }

        System.out.println(sb.toString());
    }

    static String solution(String fun, int n, String arrStr) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(arrStr, "[],");

        for (int i = 0; i < n; i++) {
            deque.addFirst(Integer.parseInt(st.nextToken()));
        }
        boolean checkReverse = false;

        for (int i = 0; i < fun.length(); i++) {
            switch (fun.charAt(i)) {
                case 'R':
                    if (deque.isEmpty()) {
                        continue;
                    }
                    checkReverse = !checkReverse;
                    break;
                case 'D':
                    if (deque.isEmpty()) {
                        return "error";
                    }
                    if (checkReverse) {
                        deque.pollFirst();
                    } else {
                        deque.pollLast();
                    }
                    break;
            }
        }

        sb.append('[');
        if (deque.size() > 0) {
            if (checkReverse) {
                sb.append(deque.pollFirst());

                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());

                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }
        }
        sb.append(']');

        return sb.toString();
    }
}
