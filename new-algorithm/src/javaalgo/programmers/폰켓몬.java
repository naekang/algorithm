package javaalgo.programmers;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println(solution(nums3));
    }

    static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return Math.min(set.size(), nums.length / 2);
    }
}
