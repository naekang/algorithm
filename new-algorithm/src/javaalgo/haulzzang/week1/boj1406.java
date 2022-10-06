package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<String> originStack = new Stack<>();
        Stack<String> tmpStack = new Stack<>();

        Arrays.stream(br.readLine().split("")).forEach(originStack::push);

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "B":
                    if (originStack.isEmpty()) break;
                    originStack.pop();
                    break;
                case "L":
                    if (originStack.isEmpty()) break;
                    tmpStack.push(originStack.pop());
                    break;
                case "D":
                    if (tmpStack.isEmpty()) break;
                    originStack.push(tmpStack.pop());
                    break;
                case "P":
                    originStack.push(st.nextToken());
                    break;
            }
        }

        while (!tmpStack.isEmpty()) {
            originStack.push(tmpStack.pop());
        }

        originStack.stream().forEach(sb::append);

        System.out.println(sb.toString());
    }
}
