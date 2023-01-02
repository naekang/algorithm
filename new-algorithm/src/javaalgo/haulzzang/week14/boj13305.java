package javaalgo.haulzzang.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj13305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] roads = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] costs = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        long ans = 0;

        for (int i = 0; i < costs.length - 1; i++) {
            if (costs[i] < costs[i + 1]) {
                costs[i + 1] = costs[i];
            }
        }

        for (int i = 0; i < N - 1; i++) {
            ans += (roads[i] * costs[i]);
        }

        System.out.println(ans);
    }
}
