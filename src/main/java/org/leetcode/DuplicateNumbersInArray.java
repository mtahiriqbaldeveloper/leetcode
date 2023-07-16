package org.leetcode;

import java.util.HashMap;

public class DuplicateNumbersInArray {

    public static void main(String ... args){

        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        HashMap<String,Integer> numberDuplic = new HashMap<>();
        for (int a : nums) {
            if(numberDuplic.containsKey(String.valueOf(a))){
//                return true;
            }
            numberDuplic.put(String.valueOf(a),1);
        }

//        return false;
    }
}
