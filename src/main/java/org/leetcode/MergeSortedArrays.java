package org.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String ... args) {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;

        int left = m - 1;
        int right = n - 1;
        int sortedIndex = m + n - 1;
        while (right >= 0){
            if(left<= 0 || nums1[left]<nums2[right]){
                nums1[sortedIndex--]= nums2[right--];

            }
            else {
                nums1[sortedIndex--] = nums1[left--];
            }
        }
        Arrays.stream(nums1).forEach(System.out::println);
    }
}
