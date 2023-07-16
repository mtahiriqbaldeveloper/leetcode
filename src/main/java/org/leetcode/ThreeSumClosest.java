package org.leetcode;


import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String ... args){

        int[] nums = {0,0,0,0};
        int target = 1;
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int aPointer = i + 1;
            int bPointer = nums.length - 1;
            while (aPointer < bPointer){
                int currentSum = nums[i]+ nums[aPointer]+ nums[bPointer];
                if(currentSum > target){
                    bPointer--;
                }else {
                    aPointer++;
                }
                if(Math.abs(currentSum-target)<Math.abs(result - target)){
                    result = currentSum;
                }
            }
        }

        System.out.println(result);
    }
}
