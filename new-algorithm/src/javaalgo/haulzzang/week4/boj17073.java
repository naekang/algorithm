package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj17073 {

    static int N, W;
    static List<Integer>[] adj;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    static String solution() {
        int cnt = 0;

        for (int i = 2; i <= N; i++) {
            if (adj[i].size() == 1) {
                cnt++;
            }
        }

        return String.format("%.10f", (double) W / cnt);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }
    }
}
