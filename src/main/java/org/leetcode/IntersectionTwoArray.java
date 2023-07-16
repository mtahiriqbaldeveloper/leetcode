package org.leetcode;

import java.util.Arrays;
import java.util.Hashtable;

public class IntersectionTwoArray {

    public static void main(String ... args){
        int[] nums1 = {4,9,5}; int[] nums2 = {9,4,9,8,5};
        //{1,2,3,4,5,6,8} {2,4,6,9}
        int n1 = nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0; int right = 0; int index = 0;
        while (left < n1 && right < n2){

            if(nums1[left] == nums2[right]){
                    nums1[index++] = nums2[right];
                    left++;
                    right++;
            } else if (nums1[left] < nums2[right]) {
                left++;

            }else {
                right++;
            }
        }

//        return Arrays.copyOf(nums1,index);
    }
}
