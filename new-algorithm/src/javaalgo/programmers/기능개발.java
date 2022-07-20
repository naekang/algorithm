package javaalgo.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {90, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = solution(progresses, speeds);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    static int[] solution(int[] progress, int[] speed) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progress.length; i++) {
            queue.add((int) Math.ceil((double) (100 - progress[i]) / speed[i]));
        }

        int cnt = 1;
        int front = queue.poll();
        while (!queue.isEmpty()) {
            if (front < queue.peek()) {
                answer.add(cnt);
                cnt = 1;
                front = queue.poll();
            } else {
                cnt++;
                queue.poll();
            }
        }

        answer.add(cnt);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
