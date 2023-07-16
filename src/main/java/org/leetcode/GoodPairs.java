package org.leetcode;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

    public static void main(String ... args){

        int[] nums = {1,2,3,1,1,3};
        int noGoodPairs = 0;
        Map<Integer,Integer> pairs= new HashMap<>();

        for(int x: nums){
            Integer fellow = pairs.getOrDefault(x, 0);
            noGoodPairs+=fellow;
            pairs.put(x, fellow+1);
        }
        System.out.println(pairs);
        System.out.println(noGoodPairs);
    }
}
