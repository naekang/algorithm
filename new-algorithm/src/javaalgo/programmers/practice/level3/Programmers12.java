package javaalgo.programmers.practice.level3;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Programmers12 {

    public static void main(String[] args) {
        String[] operations1 = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(Arrays.toString(solution(operations1)));

        String[] operations2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(solution(operations2)));
    }

    static int[] solution(String[] operations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (String operation : operations) {
            switch (operation) {
                case "D 1":
                    if (!maxHeap.isEmpty()) {
                        maxHeap.poll();
                    }
                    break;
                case "D -1":
                    if (!minHeap.isEmpty()) {
                        minHeap.poll();
                    }
                    break;
                default:
                    int num = Integer.parseInt(operation.split(" ")[1]);

                    if (maxHeap.isEmpty()) {
                        maxHeap.add(num);
                    } else {
                        if (maxHeap.peek() < num) {
                            minHeap.add(maxHeap.poll());
                            maxHeap.add(num);
                        } else {
                            minHeap.add(num);
                        }
                    }
            }
        }

        int[] answer = new int[2];

        if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
            answer[0] = maxHeap.poll();
            answer[1] = minHeap.poll();

        }
        return answer;
    }
}
