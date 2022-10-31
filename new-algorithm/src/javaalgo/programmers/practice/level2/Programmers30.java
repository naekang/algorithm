package javaalgo.programmers.practice.level2;

import java.util.Arrays;

public class Programmers30 {

    public static void main(String[] args) {
        int[] people1 = {70, 50, 80, 50};
        int limit1 = 100;

        System.out.println(solution(people1, limit1));

        int[] people2 = {70, 50, 80};
        int limit2 = 100;

        System.out.println(solution(people1, limit1));
    }

    static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int idx = 0;
        for (int i =  people.length - 1; i >= idx; i--) {
            if (people[i] + people[idx] <= limit) {
                idx++;
            }
            answer++;
        }

        return answer;
    }

}
