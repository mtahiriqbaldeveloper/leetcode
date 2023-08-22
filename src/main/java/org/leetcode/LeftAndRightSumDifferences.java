package org.leetcode;


import java.util.Arrays;

/**
 * <B>Leetcode Problem no<B/>: 2574
 * Problem Type: Array
 * Difficulty Level: easy
 */
public class LeftAndRightSumDifferences {

    public static void main(String... args) {

        int[] nums = {10, 4, 8, 3};
        int lengthNums = nums.length;
        int leftSum = 0;
        int rightSum = 0;

        int[] answer = new int[lengthNums];
        int[] leftSumArray = new int[lengthNums];
        int[] rightSumArray = new int[lengthNums];



        for (int i = 0; i < lengthNums; i++) {
            if (i == 0) {
                leftSumArray[i] = 0;
                leftSum += nums[i];
            } else {
                leftSumArray[i] = leftSum;
                leftSum += nums[i];
            }
        }

        for (int i = lengthNums - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                rightSumArray[i] = 0;
                rightSum += nums[i];
            }else {
                rightSumArray[i] = rightSum;
                rightSum += nums[i];
            }
        }
        for (int i = 0; i < lengthNums; i++) {
            answer[i] = Math.abs(leftSumArray[i]-rightSumArray[i]);
        }

        Arrays.stream(answer).forEach(System.out::println);
    }

}
