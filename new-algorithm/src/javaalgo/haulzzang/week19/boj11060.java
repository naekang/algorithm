package javaalgo.haulzzang.week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj11060 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] map = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dist = new int[N];
        Arrays.fill(dist, -1);

        dist[0] = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (dist[j] != -1 && i - j <= map[j]) {
                    if (dist[i] == -1 || dist[i] > dist[j] + 1) {
                        dist[i] = dist[j] + 1;
                    }
                }
            }
        }

        System.out.println(dist[N - 1]);
    }
}
