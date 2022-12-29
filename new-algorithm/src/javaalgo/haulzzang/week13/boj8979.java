package javaalgo.haulzzang.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj8979 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Nation[] nations = new Nation[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            nations[i] = new Nation(Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(nations);

        if (nations[0].idx == K) {
            System.out.println(1);
            return;
        }

        int answer = 1;
        int cnt = 1;
        for (int i = 1; i < N; i++) {
            Nation prevNation = nations[i - 1];
            Nation curNation = nations[i];

            if ((prevNation.gold != curNation.gold) || (prevNation.silver != curNation.silver) || (
                prevNation.bronze != curNation.bronze)) {
                answer += cnt;
                cnt = 1;
            } else {
                cnt++;
            }

            if (curNation.idx == K) {
                System.out.println(answer);
                break;
            }
        }
    }

    static class Nation implements Comparable<Nation> {

        int idx;
        int gold;
        int silver;
        int bronze;

        public Nation(int idx, int gold, int silver, int bronze) {
            this.idx = idx;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Nation o) {
            if (o.gold == this.gold) {
                if (o.silver == this.silver) {
                    return o.bronze - this.bronze;
                } else {
                    return o.silver - this.silver;
                }
            }
            return o.gold - this.gold;
        }
    }
}
