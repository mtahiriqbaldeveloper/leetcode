package org.leetcode;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String ... args){
        HashSet<Integer> set = new HashSet<>();
        int n = 19;
        while (n != 1) {
            int curr = n;
            int sum = 0;
            while (curr > 0) {

                sum += (curr % 10) * (curr % 10);

                curr /= 10;


            }
            if(!set.add(sum)){
                System.out.println("false");
//                return false;
            }

            n = sum;
        }
        System.out.println("true");
//       return true;
    }
}
