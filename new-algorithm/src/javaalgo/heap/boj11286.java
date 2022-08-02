package javaalgo.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Point implements Comparable<Point> {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int compareTo(Point o) {
        if (this.y == o.y) {
            return this.x - o.x;
        }
        return this.y - o.y;
    }
}

public class boj11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Point> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                sb.append(queue.isEmpty() ? 0 : queue.poll().x).append('\n');
            } else {
                queue.add(new Point(num, Math.abs(num)));
            }
        }

        System.out.println(sb);
    }
}
