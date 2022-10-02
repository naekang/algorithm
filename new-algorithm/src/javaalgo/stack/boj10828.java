package javaalgo.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10828 {

    static int[] arr;
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }

    static void push(int num) {
        arr[size++] = num;
    }

    static int pop() {
        if (size == 0) {
            return -1;
        } else {
            return arr[--size];
        }
    }

    static int size() {
        return size;
    }

    static int empty() {
        return size == 0 ? 1 : 0;
    }

    static int top() {
        return size() == 0 ? -1 : arr[size - 1];
    }
}
