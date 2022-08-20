package javaalgo.leetcode;

import java.util.Arrays;

/**
 * nums 배열안에서 가장 많은 숫자 찾기
 * 항상 존재한다고 가정
 */
public class leetcode_169 {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(solution(nums1)); // 3
        System.out.println(solution(nums2)); // 2
    }

    static int solution(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}
