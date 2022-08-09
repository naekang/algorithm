package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }

        int Q = Integer.parseInt(br.readLine());
        String[] targetArr = new String[Q];

        for (int i = 0; i < targetArr.length; i++) {
            targetArr[i] = br.readLine();
        }


        for (int i = 0; i < Q; i++) {
            int hitCnt = 0;
            for (int j = 0; j < N; j++) {
                if (targetArr[i].contains(strArr[j])) {
                    hitCnt++;
                }
            }
            sb.append(hitCnt > 0 ? "YES" : "NO").append('\n');
        }

        System.out.println(sb);
    }
}
