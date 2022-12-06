package javaalgo.haulzzang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class boj18115 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
            .boxed().collect(Collectors.toList());

        Collections.reverse(list);

        Deque<Integer> deque = new ArrayDeque<>();
        int num = 1;
        for (int i = 0; i < N; i++) {
            int fun = list.get(i);

            switch (fun) {
                case 1:
                    deque.addFirst(num);
                    num++;
                    break;
                case 2:
                    int tmp = deque.remove();
                    deque.addFirst(num);
                    deque.addFirst(tmp);
                    num++;
                    break;
                case 3:
                    deque.addLast(num);
                    num++;
                    break;
            }
        }

        deque.stream().forEach(i -> sb.append(i).append(' '));

        System.out.println(sb);
    }
}
