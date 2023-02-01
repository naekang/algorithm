package javaalgo.haulzzang.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2457 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Flower[] flowers = new Flower[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            flowers[i] = new Flower(a * 100 + b, c * 100 + d);
        }

        Arrays.sort(flowers);

        int start = 301;
        int end = 1201;
        int idx = 0;
        int max = 0;
        int cnt = 0;

        while (start < end) {
            boolean isFind = false;

            for (int i = idx; i < N; i++) {
                if (flowers[i].start > start) {
                    break;
                }

                if (max < flowers[i].end) {
                    isFind = true;
                    max = flowers[i].end;
                    idx = i + 1;
                }
            }

            if (isFind) {
                start = max;
                cnt++;
            } else {
                break;
            }
        }

        if (max < end) {
            System.out.println(0);
        } else {
            System.out.println(cnt);
        }
    }

    static class Flower implements Comparable<Flower> {

        int start;
        int end;

        public Flower(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Flower o) {
            if (this.start == o.start) {
                return this.end - o.end;
            }
            return this.start - o.start;
        }
    }

}
