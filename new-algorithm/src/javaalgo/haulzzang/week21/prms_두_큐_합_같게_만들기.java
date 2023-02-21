package javaalgo.haulzzang.week21;

import java.util.LinkedList;
import java.util.Queue;

public class prms_두_큐_합_같게_만들기 {

    public static void main(String[] args) {
        prms_두_큐_합_같게_만들기 sol = new prms_두_큐_합_같게_만들기();

        int[] q1 = {3, 2, 7, 2};
        int[] q2 = {4, 6, 5, 1};
        System.out.println(sol.solution(q1, q2));
    }

    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0, sum2 = 0;
        for (int i : queue1) {
            q1.add(i);
            sum1 += i;
        }
        for (int i : queue2) {
            q2.add(i);
            sum2 += i;
        }
        long totalSum = sum1 + sum2;

        if (totalSum % 2 != 0) return -1;

        totalSum /= 2;
        int idx1 = 0, idx2 = 0;
        while (idx1 <= queue1.length * 2 && idx2 <= queue1.length * 2) {
            if (sum1 == totalSum) {
                return idx1 + idx2;
            }
            if (sum1 > totalSum) {
                sum1 -= q1.peek();
                sum2 += q1.peek();
                q2.add(q1.poll());
                idx1++;
            } else {
                sum1 += q2.peek();
                sum2 -= q2.peek();
                q1.add(q2.poll());
                idx2++;
            }
        }

        return -1;
    }
}
