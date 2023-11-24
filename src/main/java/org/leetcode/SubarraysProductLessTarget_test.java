package org.leetcode;

public class SubarraysProductLessTarget_test {

    public static void main(String[] args){
        // using sliding window trick
        int[] nums = {10,5,2,6};
        int k = 100;
        int left = 0;
        int right = 0;
        int prodcut = 1;
        int result = 0;
        while (right < nums.length){
            prodcut = prodcut * nums[right];
            while (prodcut >= k){
                prodcut /=nums[left];
                left++;
            }
            result+=(right - left) + 1;
            right++;
        }
        System.out.println(result);
    }

}
