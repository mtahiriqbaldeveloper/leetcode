package org.leetcode;

public class MaxSumSubArray {

    public static void main(String ... args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int r = 0;
        int l = 1;
       while (r < l && l<=nums.length){

           sum += nums[l - 1];
           max = sum > max? sum : max;
           if(sum <= 0){
               sum = 0;
               r = l;
           }
           l++;
        }
        System.out.println(max);
    }
}
