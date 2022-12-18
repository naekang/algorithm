package javaalgo.haulzzang.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class boj18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] originArr = Arrays.copyOf(arr, N);

        Arrays.sort(arr);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int idx = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                map.put(arr[i], idx++);
            }

            if (map.containsKey(arr[i])) {
                continue;
            } else {
                map.put(arr[i], idx++);
            }
        }

        for (int i : originArr) {
            sb.append(map.get(i)).append(' ');
        }

        System.out.println(sb.toString());
    }
}
