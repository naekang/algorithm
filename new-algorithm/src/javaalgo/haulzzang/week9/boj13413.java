package javaalgo.haulzzang.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj13413 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            String origin = br.readLine();
            String changed = br.readLine();

            int diffCnt = 0;
            int originBCnt = (int) Arrays.stream(origin.split("")).filter(c -> c.equals("B")).count();
            int changedBCnt = (int) Arrays.stream(changed.split("")).filter(c -> c.equals("B")).count();
            for (int i = 0; i < N; i++) {
                if (origin.charAt(i) != changed.charAt(i)) {
                    diffCnt++;
                }
            }

            int switchCnt = Math.abs(originBCnt - changedBCnt);
            int reverseCnt = diffCnt - switchCnt;
            sb.append(switchCnt + reverseCnt / 2).append('\n');
        }

        System.out.println(sb.toString());
    }

}
