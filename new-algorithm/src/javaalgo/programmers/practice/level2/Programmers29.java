package javaalgo.programmers.practice.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Programmers29 {
    public static void main(String[] args) {
        int n1 = 3;
        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int n2 = 5;
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

        int n3 = 2;
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};

        System.out.println(Arrays.toString(solution(n1, words1)));
        System.out.println(Arrays.toString(solution(n2, words2)));
        System.out.println(Arrays.toString(solution(n3, words3)));

    }

    static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        int len = words.length;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < len - 1; i++) {
            String frontStr = words[i];
            String backStr = words[i + 1];

            if (frontStr.charAt(frontStr.length() - 1) == backStr.charAt(0)) {
                set.add(frontStr);
            }

            if (set.contains(backStr) || frontStr.charAt(frontStr.length() - 1) != backStr.charAt(0)) {
                answer[0] = (i + 1) % n + 1;
                answer[1] = (i + 1) / n + 1;
                break;
            }

        }

        return answer;
    }
}
