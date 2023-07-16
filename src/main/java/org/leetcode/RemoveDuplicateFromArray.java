package org.leetcode;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveDuplicateFromArray {

    public static void main(String ... args){
        int[] nums = {0,1,1,1,2,2,3,4};
        int n = nums.length;
//        if(n<=1){return n;}

        int left = 0; //everything to the left of left(inclusive) is good
        int right = 1;//the current element we are processing

        while(right<=n-1){
            if(nums[right] == nums[left]){
                right++;
            }
            else{
                nums[left+1] = nums[right];
                left++;
                right++;
            }
        }

    }
}
