package javaalgo.leetcode;

import java.util.ArrayList;

public class leetcode1 {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};

        int target = 6;
        int[] answer = twoSum(nums2, target);

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                    break;
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
