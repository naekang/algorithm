package javaalgo.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class level1_제일_작은_수_제거하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {

        if (arr.length == 1) {
            arr[0] = -1;
        } else {
            int removeElem = Arrays.stream(arr).min().getAsInt();

            arr = Arrays.stream(arr)
                    .filter(i -> i != removeElem)
                    .toArray();
        }

        return arr;
    }
}
