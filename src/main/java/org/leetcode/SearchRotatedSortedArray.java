package org.leetcode;


/**
 * <B>Leetcode Problem no<B/>: 33
 * Problem Type: Array
 * Difficulty Level: Medium
 */
public class SearchRotatedSortedArray {

    public static void main(String... args) {

        System.out.println(extracted());
    }

    private static int extracted() {
        int[] nums = {1};
        int target = 1;
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        for (; leftIndex <= rightIndex; ) {
            if (nums[rightIndex] == target) {
                return rightIndex;
            } else if (nums[leftIndex] == target) {
                return leftIndex;
            }
            rightIndex--;
            leftIndex++;
        }

        return -1;
    }
}
