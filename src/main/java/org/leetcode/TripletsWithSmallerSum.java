package org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsWithSmallerSum {

    public static void main(String... args) {

        int[] nums = {-1, 4, 2, 1, 3};  //[-1, 1, 2, 3, 4]
        int target = 5;
        Arrays.sort(nums);
        final int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            int first = nums[i];
            while (left < right){
                int second = nums[left];
                int third = nums[right];
                int sum = first + second + third;
                if(sum < target){
                    count += right - left;
                    left++;

                }else {
                    right--;
                }
            }
        }

        System.out.println(count);

    }
}
