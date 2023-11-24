package org.leetcode;

import java.util.Arrays;

public class ReplaceElementsGreatestElementRightSide {


    public static void main(String... args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {

            if(arr[i] > max){
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }else {
                arr[i] = max;
            }

        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
