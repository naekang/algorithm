package javaalgo.haulzzang.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1717 {

    static int n, m;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        parents = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int operator = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (operator == 0) {
                union(a, b);
            } else if (operator == 1) {
                sb.append(isUnion(a, b) ? "YES" : "NO").append('\n');
            }
        }

        System.out.println(sb.toString());
    }

    static int find(int x) {
        if (x == parents[x]) {
            return x;
        } else {
            return parents[x] = find(parents[x]);
        }
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            parents[y] = x;
        }
    }

    static boolean isUnion(int x, int y) {
        x = find(x);
        y = find(y);
        return x == y;
    }
}
