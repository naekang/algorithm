package javaalgo.haulzzang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class boj2800 {

    static char[] arr;
    static List<Point> brackets = new ArrayList<>();
    static Set<String> set = new TreeSet<>();
    static boolean[] visited;
    static boolean isFirst;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        System.out.println(solution(exp));
    }

    static String solution(String exp) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        arr = exp.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                brackets.add(new Point(stack.pop(), i));
            }
        }
        visited = new boolean[arr.length];
        Arrays.fill(visited, true);
        isFirst = true;


        dfs(0);

        for (String s : set) {
            sb.append(s).append('\n');
        }

        return sb.toString();
    }

    static void dfs(int depth) {
        if (depth == brackets.size()) {
            if (isFirst) {
                isFirst = false;
            } else {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < arr.length; i++) {
                    if (visited[i]) {
                        sb.append(arr[i]);
                    }
                }
                set.add(sb.toString());
            }
            return;
        }

        Point point = brackets.get(depth);

        visited[point.x] = true;
        visited[point.y] = true;
        dfs(depth + 1);

        visited[point.x] = false;
        visited[point.y] = false;
        dfs(depth + 1);
    }
}
