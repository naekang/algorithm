package javaalgo.haulzzang.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1976 {

    static int N, M;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        parents = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parents[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    union(i, j);
                }
            }
        }

        int[] plan = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;
        for (int i = 0; i < plan.length - 1; i++) {
            if (!isUnion(plan[i], plan[i + 1])) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "YES" : "NO");

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
