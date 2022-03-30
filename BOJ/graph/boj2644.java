import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2644 {

    static int n, fst, sec, m;
    static ArrayList<Integer>[] adj;
    static int[] visit;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        fst = Integer.parseInt(st.nextToken());
        sec = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());
        adj = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visit[start] = 0;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int y : adj[x]) {
                if (visit[y] != -1) continue;

                queue.add(y);
                visit[y] = visit[x] + 1;
            }
        }
    }

    static void pro() {
        visit = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            visit[i] = -1;
        }
        bfs(fst);
        System.out.println(visit[sec]);
    }

}
