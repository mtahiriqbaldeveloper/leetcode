package org.leetcode;

/**
 * <B>Leetcode Problem no<B/>: 31
 * Problem Type: Array,
 * Difficulty Level: Medium,
 * Description: Next Permutation
 */

public class NextPermutation {

    public static void main(String ... args){
        int[] array = {6, 2, 1, 5, 4, 3, 0};

        int i = array.length - 2;

        while (i >= 0 && array[i+1] <=  array[i]){
            i--;
        }
        int j = array.length - 1;
        while (array[j] <= array[i]){
             j--;
        }
        swap(array, i, j);
        reverse(array, i);
        for (int i1 : array) {
            System.out.println(i1);
        }
    }

    public static void reverse(int[] array, int start){
        int i = start + 1; int j = array.length -1;
        while (i < j){
            swap(array, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
