package org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {

    public static void main(String ... args){

        List<List<Integer>> result = new ArrayList<>();
        int[] array = {-3, 0, 1, 2, -1, 1, -2};

        // this what we are trying to achieve
        // x + y + z = 0;
        // x + y = -z;
        Arrays.sort(array);

//        {-3, -2, -1, 0, 1, 1, 2}
//
        for (int i = 0; i< array.length -2 ; i++){
            if(array[i] == array[i +1])
                continue;
            searchInArray(result, -array[i], i + 1, array);
        }
        System.out.println(result);
    }

    static void searchInArray(List<List<Integer>> result, int targetSum, int left, int[] array){
        int right = array.length - 1;
        while (left < right){
            int currentSum = array[left] + array[right];
            if(currentSum == targetSum){
                result.add(List.of(array[left], array[right], -targetSum));
                left++;
                right--;
                while (left<right && array[left] == array[left-1])
                    left++;
                while (left<right && array[right] == array[right +1])
                    right--;

            } else if (currentSum < targetSum) {
                left++;
            }else {
                right--;
            }

        }
    }
}
