package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());


        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;
            while (true) {
                int[] tmp = queue.poll();
                boolean flag = true;

                for (int[] q : queue) {
                    if (q[1] > tmp[1]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    cnt++;
                    if (tmp[0] == M) break;
                } else {
                    queue.add(tmp);
                }

            }
            sb.append(cnt).append('\n');

        }
        System.out.println(sb.toString());
    }
}
