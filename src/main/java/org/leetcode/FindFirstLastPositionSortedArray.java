package org.leetcode;


import java.util.Arrays;

/**
 * <B>Leetcode Problem no<B/>: 34
 * Problem Type: Array
 * Difficulty Level: Medium
 */
public class FindFirstLastPositionSortedArray {

    public static void main(String... args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] resultedIndex = {-1, -1};
        resultedIndex[0] = findFirst(nums, target);
        resultedIndex[1] = findSecond(nums,target);

    }

    public static int findFirst(int[] nums, int target){
        int left = 0;
        int result = -1;
        int right = nums.length-1;
        while (left <= right){

            int mid = (left + right) / 2;

            if(nums[mid] >= target){
                right = mid - 1;

            }else {
                left = mid + 1;
            }
            if(target == nums[mid]){
                result = mid;
            }
        }
        return result;
    }

    public static int findSecond(int[] nums, int target){
        int left = 0;
        int result = -1;
        int right = nums.length-1;
        while (left <= right){

            int mid = (left + right) / 2;

            if(nums[mid] <= target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
            if(target == nums[mid]){
                result = mid;
            }
        }
        return result;
    }

}
