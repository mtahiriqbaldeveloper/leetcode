package org.leetcode;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args){

        int[] nums = {2,0,2,1,1,0};
        int left = 0 ;
        int right = nums.length - 1;
        while (left < right){

            while (right > 0 && nums[left] > nums[right]){
                //swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
            while(right > 1 && nums[right] > nums[right - 1] && right != nums.length -1){
                int temp = nums[right];
                nums[right - 1] = nums[right];
                nums[right] = temp;
             }
            left++;

        }
        Arrays.stream(nums).forEach(System.out::println);
    }


}
