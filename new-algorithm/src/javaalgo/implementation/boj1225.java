package javaalgo.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        long sum = 0;

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                sum += (long) Integer.parseInt(A.charAt(i) + "") * Integer.parseInt(B.charAt(j) + "");
            }
        }

        System.out.println(sum);
    }
}
