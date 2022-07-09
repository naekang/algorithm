package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String replace1 = str.replace('0', ' ');
        String replace2 = str.replace('1', ' ');

        StringTokenizer st1 = new StringTokenizer(replace1);
        StringTokenizer st2 = new StringTokenizer(replace2);


        System.out.println(Math.min(st1.countTokens(), st2.countTokens()));
    }
}
