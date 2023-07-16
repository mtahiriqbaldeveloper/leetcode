package org.leetcode;

import java.util.Arrays;

public class ConcatenationArray {

    public static void main(String... args){
        int[] nums = {1,2,1};
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < ans.length; i++) {
            if(i > 2){
             ans[i] = nums[i-3];
            }
            else {
                ans[i] = nums[i];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
