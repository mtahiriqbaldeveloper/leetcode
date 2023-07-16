package org.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class ContainerWaterProblem {

    public static void main(String[] x){

        int[] height = {1,8,6,2,5,4,8,3,7};
        List<Long> list = new ArrayList<>();
        list.add(1l);
        list.add(2l);
        list.add(3l);
        list.add(4l);






        int leftPointer = 0;
        int rightPointer = height.length-1;
        int result = 0;
        while(leftPointer < rightPointer){

            int current = (rightPointer-leftPointer) * height[leftPointer] < height[rightPointer]? height[leftPointer]:height[rightPointer];
//            System.out.println(current);
            result = Math.max(result,current);
            if(height[leftPointer]< height[rightPointer]){
                leftPointer++;
            }else {
                rightPointer--;
            }
        }
        System.out.println(result);
//        return result;
    }
}
