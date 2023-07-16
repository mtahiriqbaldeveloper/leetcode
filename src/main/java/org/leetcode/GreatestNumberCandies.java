package org.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *<B>Leetcode Problem no<B/>: 1431
 *Problem Type: Array
 *Difficulty Level: easy
 */
public class GreatestNumberCandies {

    public static void main(String ... args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        int maxNumber = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy:candies) {
            if(candy> maxNumber){
                maxNumber = candy;
            }
        }
        for (int candy:candies) {
            if((candy+extraCandies)>= maxNumber){
                result.add(true);
            }else {
                result.add(false);
            }
        }

        System.out.println(result);
    }
}
