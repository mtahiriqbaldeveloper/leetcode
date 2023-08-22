package org.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Type: Array,
 * Difficulty Level: Medium,
 * Description: Create Target Array in the Given Order
 */
public class CreateTargetArrayByOrder {

    public static void main(String ... args){

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int length = nums.length;
        List<Integer> rb = new ArrayList<>();
        int[] result = new int[length];
        for (int i = 0; i <length; i++) {
           rb.add(index[i],nums[i]);
        }

        for (int i = 0; i < length; i++) {
            result[i] = rb.get(i);
        }

    }

}
