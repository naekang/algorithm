package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj1021 {

    static int N, M, cnt;
    static int[] arr;
    static LinkedList<Integer> queue;

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println(cnt);
    }

    static void solution() {
        for (int i = 0; i < M; i++) {
            int idx = queue.indexOf(arr[i]);

            int mid = queue.size() % 2 == 0 ? queue.size() / 2 - 1 : queue.size() / 2;

            if (idx <= mid) {
                for (int j = 0; j < idx; j++) {
                    queue.offerLast(queue.pollFirst());
                    cnt++;
                }
            } else {
                for (int j = 0; j < queue.size() - idx; j++) {
                    queue.offerFirst(queue.pollLast());
                    cnt++;
                }
            }
            queue.pollFirst();
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}

