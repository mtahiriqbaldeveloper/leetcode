package org.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class TwoSum {

    public static void main(String ... args){
        int[] nums={2,15,11,7};
        int target=9;
        HashMap<Integer,Integer> numberHash = new HashMap<>();

        for(int index = 0 ;index < nums.length; index++){

            if(numberHash.containsKey(nums[index])){
                System.out.println(index);
                int x = numberHash.get(nums[index]);
                int y = index+1;
//                return new int[]{x,y};
            }
            else {
                numberHash.put(target-nums[index],index);

            }

        }

//        return new int[2];
    }
}
