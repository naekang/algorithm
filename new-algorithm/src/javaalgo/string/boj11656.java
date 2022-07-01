package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class boj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.substring(i));
        }

        for (String s : set) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}
