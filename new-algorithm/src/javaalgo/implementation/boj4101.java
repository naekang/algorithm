package javaalgo.implementation;

import java.io.*;
import java.util.*;

public class boj4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) break;

            if (A > B) sb.append("Yes").append('\n');
            else sb.append("No").append('\n');
        }

        System.out.println(sb);
    }
}
