package javaalgo.haulzzang.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj13244 {

    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());

            parents = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                parents[i] = i;
            }

            boolean flag = false;

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if (find(x) != find(y)) {
                    union(x, y);
                } else {
                    flag = true;
                }
            }

            Set<Integer> set = new HashSet<>();

            for (int i = 1; i <= N; i++) {
                set.add(find(parents[i]));
            }

            if (flag || set.size() > 1) {
                sb.append("graph").append('\n');
            } else {
                sb.append("tree").append('\n');
            }
        }

        System.out.println(sb.toString());
    }

    static int find(int x) {
        if (parents[x] == x) {
            return x;
        }
        return parents[x] = find(parents[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }

        parents[y] = x;
    }
}
