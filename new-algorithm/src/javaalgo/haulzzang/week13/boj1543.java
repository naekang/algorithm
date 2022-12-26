package javaalgo.haulzzang.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String origin = br.readLine();
        String target = br.readLine();

        int ans = 0;
        while (origin.contains(target)) {
            origin = origin.replaceFirst(target, " ");
            ans++;
        }
        System.out.println(ans);
    }
}
