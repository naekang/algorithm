package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        double ratio = Math.sqrt(Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2)));

        System.out.println((int) (ratio * H) + " " + (int) (ratio * W));
    }
}
