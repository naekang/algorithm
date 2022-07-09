package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        System.out.println(revFun(revFun(X) + revFun(Y)));
    }

    static int revFun(int a) {
        return Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
    }
}
