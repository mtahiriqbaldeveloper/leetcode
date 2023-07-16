package org.leetcode;



/**
 *<B>Leetcode Problem no<B/>: 2011
 *Problem Type: Array
 *Difficulty Level: easy
 */


public class PerformingOperations {

    public static void main(String ... args){

        String[] operations = {"++X","++X","X++"};
        int x = 0;

        for (String s: operations) {

            if(s.equals("--X")){
                --x;
            } else if (s.equals("X++")) {
                x++;
            } else if (s.equals("X--")) {
                x--;
            }else if(s.equals("++X")){
                ++x;
            }
        }

        System.out.println(x);
    }
}
