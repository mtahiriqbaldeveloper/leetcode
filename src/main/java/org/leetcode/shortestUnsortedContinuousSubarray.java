package org.leetcode;


public class shortestUnsortedContinuousSubarray {

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i - 1]);
            }
        }
        if (min == Integer.MAX_VALUE)
            System.out.println("sorted array");
        int left = 0;
        int right = nums.length - 1;
        while (nums[left] <= min || nums[right] >= max) {
            if (nums[left] <= min) {
                left++;
            }
            if (nums[right] >= max) {
                right--;
            }
        }
        System.out.println((right - left + 1));
    }
}
