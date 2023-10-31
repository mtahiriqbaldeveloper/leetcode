package org.leetcode;


import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String ... args){

        int[] nums = {-1,2,1,-4};
        int target = 1;
        Arrays.sort(nums);
        int lowestDiff = Integer.MAX_VALUE;
        final int n = nums.length;
        int result = 0;

        for (int i = 0; i < n -2 ; i++) {
            int first = nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right){

                int second = nums[left];
                int third = nums[right];

                int sum = first + second + third;

                int diff = Math.abs(target - sum);
                if( diff < lowestDiff){
                    if(diff == 0){
                        System.out.println(target);
//                        return target;
                    }
                    lowestDiff = diff;
                    result = sum;
                }
                if(sum < target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        System.out.println(result);
//        return result;
    }
}
