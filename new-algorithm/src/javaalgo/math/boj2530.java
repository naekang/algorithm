package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int needHour = Integer.parseInt(br.readLine());

        int nowSecond = hour * 3600 + minute * 60 + second;
        int after = nowSecond + needHour;

        int afterHour = (after / 3600) % 24;
        int afterMinute = (after % 3600) / 60;
        int afterSecond = (after % 3600) % 60;

        System.out.println(afterHour + " " + afterMinute + " " + afterSecond);
    }
}
