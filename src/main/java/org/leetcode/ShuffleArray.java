package org.leetcode;

public class ShuffleArray {

    public static void main(String ... args){

        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;

        int[] shuffledArray = new int[n*2];
        int xPointer = 0;
        int yPointer = n;
        boolean isXTurn = true;

        for(int i = 0; i < nums.length ;i++){
            if (isXTurn){
                shuffledArray[i] = nums[xPointer];
                xPointer+=1;
                isXTurn = false;
            }else {
                shuffledArray[i] = nums[yPointer];
                yPointer +=1;
                isXTurn = true;
            }
        }
        for (int j : shuffledArray) {
            System.out.println(j);
        }
    }
}
