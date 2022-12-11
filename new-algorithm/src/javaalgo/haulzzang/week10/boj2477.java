package javaalgo.haulzzang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2477 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int maxWidth = 0, maxHeight = 0;
        int maxWidthIdx = 0, maxHeightIdx = 0;
        int[] lenArr = new int[6];
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int dir = Integer.parseInt(st.nextToken());
            lenArr[i] = Integer.parseInt(st.nextToken());

            if (dir == 1 || dir == 2) {
                if (maxHeight < lenArr[i]) {
                    maxHeight = lenArr[i];
                    maxHeightIdx = i;
                }
            } else {
                if (maxWidth < lenArr[i]) {
                    maxWidth = lenArr[i];
                    maxWidthIdx = i;
                }
            }
        }

        int maxArea = maxHeight * maxWidth;
        int subArea = lenArr[(maxHeightIdx + 3) % 6] * lenArr[(maxWidthIdx + 3) % 6];

        System.out.println((maxArea - subArea) * K);
    }
}
