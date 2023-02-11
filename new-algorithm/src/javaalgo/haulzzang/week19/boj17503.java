package javaalgo.haulzzang.week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj17503 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Beer> beers = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            beers.add(new Beer(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(beers);

        int ans = -1;
        int sum = 0;
        for (Beer beer : beers) {
            pq.add(beer.prefer);
            sum += beer.prefer;

            if (pq.size() > N) {
                sum -= pq.poll();
            }
            if (pq.size() == N && sum >= M) {
                ans = beer.level;
                break;
            }
        }

        System.out.println(ans);
    }

    static class Beer implements Comparable<Beer> {

        int prefer;
        int level;

        public Beer(int prefer, int level) {
            this.prefer = prefer;
            this.level = level;
        }


        @Override
        public int compareTo(Beer o) {
            if (this.level == o.level) {
                return o.prefer - this.prefer;
            }
            return this.level - o.level;
        }
    }
}
