package org.leetcode;


import java.util.Arrays;


/**
 *<B>Leetcode Problem no<B/>: 1365,
 *Problem Type: Array,
 *Difficulty Level: easy,
 * Description: How Many Numbers Are Smaller Than the Current Number
 */
public class NumbersSmallerThanCurrentNumber {

    public static void main(String ... args){
        int[] nums = {8,1,2,2,3}; //{1,2,2,3,8}
        int counter = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j] && nums[i] != nums[j]){
                    counter++;
                }
            }
            result[i] = counter;
            counter = 0;
        }


        Arrays.stream(result).forEach(System.out::println);

    }

}
