package org.leetcode;

public class TrappingRainWater {

    public static void main(String ... args){

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = height.length;

        //set left and right pointers

        int left = 0;
        int right = n-1;

        int res = 0;

        int maxleft = 0;
        int maxright = 0;

        // loop until left and right pointers meet
        while(left <= right){

            // if height[left] is smaller or equal to height[right]
            if(height[left] <= height[right]){

                // if height[left] is greater than or equal to maxleft,
                // update max left to height[left]
                if(height[left] >= maxleft){
                    maxleft = height[left];
                }

                // if height[left] is smaller than maxleft,
                // it means there is a potential to trap water
                else{
                    // add the difference between maxleft and height[left] to res
                    // this represents the amount of water trapped at the current position
                    res += maxleft - height[left];
                }
                // move the left pointer to the next position
                left++;
            }
            // if height[left] is greater than height[right]
            else{
                // if height[right] is greater than or equal to maxright,
                // update maxright to height[right]
                if(height[right] >= maxright){
                    maxright = height[right];
                }
                // if height[right] is smaller than maxright,
                // it means there is a potential to trap water
                else{
                    // add the difference between maxright and height[right] to res
                    // this represents the amount of water trapped at the current position
                    res += maxright - height[right];
                }
                // move the right pointer to the previous position
                right--;
            }
        }
        // return the total amount of trapped water
        System.out.println(res);
    }
}
