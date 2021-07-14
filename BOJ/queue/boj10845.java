import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int input = 0;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            if (str.contains("push")) {
                input = sc.nextInt();
                q.add(input);
            } else if (str.contains("front")) {
                System.out.println(q.isEmpty() ? -1 : q.peek());
            } else if (str.contains("back")) {
                System.out.println(q.isEmpty() ? -1 : input);
            } else if (str.contains("size")) {
                System.out.println(q.size());
            } else if (str.contains("pop")) {
                System.out.println(q.isEmpty() ? -1 : q.poll());
            } else if (str.contains("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            }
        }
        sc.close();
    }
}
