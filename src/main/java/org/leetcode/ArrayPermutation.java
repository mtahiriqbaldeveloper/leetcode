package org.leetcode;

public class ArrayPermutation {


    public static void main(String... args){
        int[] result = buildArray(new int[]{0, 2, 1, 5, 3, 4});
        for (int i: result) {
            System.out.println(i);
        }

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
