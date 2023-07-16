package org.leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String ... args){



        int[] nums1 = {1,2}; int[] nums2 = {3,4};

        int size = nums1.length + nums2.length;

        int[] mergedNums = new int[size];

        int k = 0; int left = 0; int right = 0;

        double median = 0;
        int leftArrayLength = nums1.length;
        int rightArrayLength = nums2.length;

        while (left < leftArrayLength && right < rightArrayLength){

            if(nums1[left] < nums2[right]){
                mergedNums[k++] = nums1[left];
                left++;
            }
            else {
                mergedNums[k++] = nums2[right];
                right++;
            }

        }
        while (left<nums1.length){
            mergedNums[k++] = nums1[left++];
        }
        while (right<nums2.length){
            mergedNums[k++] = nums2[right++];
        }

//       Arrays.stream(mergedNums).forEach(System.out::print);
//        System.out.println("=====");

        if(size % 2 == 0 ){

            int x = size / 2;
            System.out.println("even");
            double sum = (mergedNums[x]+mergedNums[x-1]);
            median = sum/2;
            System.out.println(median);
        }
        else {

            System.out.println("odd");
            median = mergedNums[size/2];
            System.out.println(median);
        }


    }
}
