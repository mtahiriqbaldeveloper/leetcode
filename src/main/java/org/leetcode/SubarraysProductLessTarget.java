package org.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubarraysProductLessTarget {

    public static void main(String[] args){

        int[]arr = {10,5,2,6};
        int target = 100;
        List<List<Integer>> result = new ArrayList<>();

        int left = 0;
        int product = 1;

        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];

            while (product >= target && left <= right) {
                product /= arr[left];
                left++;
            }

            // Any subarray from 'left' to 'right' has a product less than the target.
            // So, we can create all subarrays from 'left' to 'right' and add them to the result.
//            for (int i = right; i >= left; i--) {
//                List<Integer> subarray = new ArrayList<>();
//                for (int j = i; j <= right; j++) {
//                    subarray.add(arr[j]);
//                }
//                result.add(subarray);
//            }
        }
        System.out.println(result.size());
        System.out.println(result);
    }


}
