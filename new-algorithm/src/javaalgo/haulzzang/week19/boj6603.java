package javaalgo.haulzzang.week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj6603 {

    static final int MAX_CHOICE = 6;
    static int k;
    static int[] numbers;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        while (!(input = br.readLine()).equals("0")) {
            sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(input);

            k = Integer.parseInt(st.nextToken());
            numbers = new int[k];
            visited = new boolean[k];

            for (int i = 0; i < k; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            backTracking(0, 0);

            System.out.println(sb.toString());
        }
    }

    static void backTracking(int depth, int start) {
        if (depth == MAX_CHOICE) {
            for (int i = 0; i < k; i++) {
                if (visited[i]) {
                    sb.append(numbers[i]).append(" ");
                }
            }
            sb.append("\n");
        }

        for (int i = start; i < k; i++) {
            visited[i] = true;
            backTracking(depth + 1, i + 1);
            visited[i] = false;
        }
    }
}
