package javaalgo.haulzzang.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1446 {

    static int N, D;
    static int[] distArr;
    static Road[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        distArr = new int[D + 1];
        for (int i = 0; i <= D; i++) {
            distArr[i] = i;
        }
        map = new Road[D];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map[i] = new Road(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()));
        }

        dijkstra(0);
        System.out.println(distArr[D]);
    }

    static void dijkstra(int start) {
        PriorityQueue<Road> pq = new PriorityQueue<>();

        pq.offer(new Road(start, 0, 0));
        distArr[start] = 0;

        while (!pq.isEmpty()) {
            Road cur = pq.poll();
            int dest = cur.end;
            for (Road r : map) {
                if (r == null) {
                    break;
                }
                if (r.start >= dest) {
                    if (r.end > D) {
                        continue;
                    }
                    int tmp = r.start - dest;
                    if (distArr[r.end] > distArr[dest] + r.dist + tmp) {
                        distArr[r.end] = distArr[dest] + r.dist + tmp;
                        pq.offer(new Road(dest, r.end, distArr[r.end]));
                    }
                }
            }
            distArr[D] = Math.min(distArr[D], distArr[dest] + D - dest);
        }
    }
}

class Road implements Comparable<Road> {

    int start;
    int end;
    int dist;

    Road(int start, int end, int dist) {
        this.start = start;
        this.end = end;
        this.dist = dist;
    }

    @Override
    public int compareTo(Road o) {
        return this.dist - o.dist;
    }
}
