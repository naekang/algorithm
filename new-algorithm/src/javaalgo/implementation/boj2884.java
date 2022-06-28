package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int tmpMinute = H == 0 ? (H + 24) * 60 + M : H * 60 + M;

        int resultH = (tmpMinute - 45) / 60 == 24 ? 0 : (tmpMinute - 45) / 60;
        int resultM = (tmpMinute - 45) % 60;

        System.out.println(resultH + " " + resultM);

    }
}
