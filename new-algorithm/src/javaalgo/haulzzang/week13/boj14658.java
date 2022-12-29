package javaalgo.haulzzang.week13;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14658 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Point[] points = new Point[K];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        for (int i = 0; i < K; i++) {
            int x = points[i].x;
            for (int j = 0; j < K; j++) {
                int y = points[j].y;
                int cnt = 0;
                for (int k = 0; k < K; k++) {
                    int nx = points[k].x;
                    int ny = points[k].y;
                    if (x <= nx && nx <= x + L && y <= ny && ny <= y + L) {
                        cnt++;
                    }
                }
                answer = Math.max(answer, cnt);
            }
        }

        System.out.println(K - answer);
    }
}
