package org.leetcode;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RemoveElement {

    public static void main(String ... args){

        int[] nums = {3,2,2,3}; int val = 3;
        int left = 0;
        int right = nums.length;
        while (left < right){
            if(nums[left] == val){
                nums[left] = nums[right-1];
                right--;
            }else{
                left++;
            }
        }
        System.out.println(right);
    }


}
