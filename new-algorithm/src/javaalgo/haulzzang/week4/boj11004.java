package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted()
            .skip(K - 1).findFirst().getAsInt();

        System.out.println(answer);
    }

}
