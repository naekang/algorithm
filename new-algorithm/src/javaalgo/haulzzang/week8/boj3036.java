package javaalgo.haulzzang.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj3036 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        while (!queue.isEmpty()) {
            int bottom = queue.poll();

            for (int i = 0; i < N - 1; i++) {
                int top = queue.poll();
                int gcd = gcd(bottom, top);
                sb.append(bottom / gcd).append('/').append(top / gcd).append('\n');
            }
        }

        System.out.println(sb.toString());
    }

    static int gcd(int a, int b) {
        int tmp, n;

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }

}
