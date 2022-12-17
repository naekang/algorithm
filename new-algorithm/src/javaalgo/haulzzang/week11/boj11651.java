package javaalgo.haulzzang.week11;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Point[] arr = new Point[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i] = new Point(Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.y == o2.y) {
                return o1.x - o2.x;
            }
            return o1.y - o2.y;
        });

        for (Point point : arr) {
            sb.append(point.x).append(' ').append(point.y).append('\n');
        }

        System.out.println(sb.toString());
    }
}
