package org.leetcode;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String ... args){
        int[] nums = {1,2,-5,8,-11};
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            int idx = Math.abs(nums[i]) - 1;
            System.out.println(idx + " idx");
            if (idx < j && nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }
        for (int i = 0; i < j; i++) {
            if (nums[i] > 0) {
                System.out.println(i + 1);
                //return i + 1;
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
