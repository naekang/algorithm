package javaalgo.haulzzang.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj21939 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Problem[] problems = new Problem[N];

        PriorityQueue<Problem> minHeap = new PriorityQueue<>();
        PriorityQueue<Problem> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        HashSet<Integer> solvedSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            problems[i] = new Problem(Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()), true);
            minHeap.add(problems[i]);
            maxHeap.add(problems[i]);
        }

        int P = Integer.parseInt(br.readLine());

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "add":
                    Problem problem = new Problem(Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()), false);

                    minHeap.add(problem);
                    maxHeap.add(problem);
                    break;
                case "solved":
                    solvedSet.add(Integer.parseInt(st.nextToken()));
                    break;
                case "recommend":
                    int num = Integer.parseInt(st.nextToken());
                    PriorityQueue<Problem> pq = num == 1 ? maxHeap : minHeap;

                    while (pq.peek().isRecommended && solvedSet.contains(pq.peek().no)) {
                        pq.poll();
                    }
                    sb.append(pq.peek().no).append('\n');
                    break;
            }
        }

        System.out.println(sb.toString());
    }

    static class Problem implements Comparable<Problem> {
        int no;
        int diff;
        boolean isRecommended;

        public Problem(int no, int diff, boolean isRecommended) {
            this.no = no;
            this.diff = diff;
            this.isRecommended = isRecommended;
        }

        @Override
        public int compareTo(Problem o) {
            if (o.diff == this.diff) {
                return this.no - o.no;
            }
            return this.diff - o.diff;
        }
    }
}
