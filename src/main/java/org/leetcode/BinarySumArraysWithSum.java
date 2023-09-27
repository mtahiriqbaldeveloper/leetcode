package org.leetcode;


/**
 * <B>Leetcode Problem no<B/>: 930
 * Problem Type: Array
 * Difficulty Level: Medium
 */



public class BinarySumArraysWithSum {

    public static int main(String ...args){

        int[] nums   = {1,0,1,0,1};
        int goal = 2;

        if(nums == null || nums.length == 0) return 0;

        int numOfSubArray = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        int currentSum = 0;
        while (rightPointer < nums.length && leftPointer < nums.length){

            currentSum += nums[rightPointer];
            if(currentSum < goal){
                rightPointer++;
            }else if(currentSum > goal){
                leftPointer++;
                currentSum = 0;
                rightPointer = leftPointer;
            }else {
                numOfSubArray++;
                rightPointer++;
                if(rightPointer == nums.length){
                    leftPointer++;
                    rightPointer = leftPointer;
                    currentSum = 0;
                }
            }

        }
        return numOfSubArray;
    }

}
