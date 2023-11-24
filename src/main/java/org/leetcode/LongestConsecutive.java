package org.leetcode;

import java.util.HashSet;
import java.util.Set;


/**
 *<B>Leetcode Problem no<B/>: 128
 *Problem Type: Array
 *Difficulty Level: medium
 */
public class LongestConsecutive {
    public static void main(String ...args){

        int[] numbs = {100,4,200,1,3,2};
        Set<Integer> set = new HashSet<>();
        for (int no:numbs){
            set.add(no);
        }
        int longestCount = 1;
        for (Integer num: set){

            if(!set.contains(num - 1)){
                int tempCount = 1;
                while (set.contains(num + 1)){
                    tempCount++;
                    num++;
                }

                longestCount = Math.max(tempCount, longestCount);
            }
        }

        System.out.println(longestCount);
    }
}
