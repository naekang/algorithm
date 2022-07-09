package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String[] arr = br.readLine().split(" ");

            if (pro(arr) == 4) sb.append("D").append("\n");
            else if (pro(arr) == 3) sb.append("C").append("\n");
            else if (pro(arr) == 2) sb.append("B").append("\n");
            else if (pro(arr) == 1) sb.append("A").append("\n");
            else sb.append("E").append("\n");
        }

        System.out.println(sb);
    }

    static int pro(String[] arr) {
        return (int) Arrays.stream(arr)
                .filter(i -> i.equals("0"))
                .count();
    }
}
