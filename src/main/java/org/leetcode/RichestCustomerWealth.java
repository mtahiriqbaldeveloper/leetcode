package org.leetcode;

/**
 *<B>Leetcode Problem no<B/>: 1672
 *Problem Type: Array
 *Difficulty Level: easy
 */
public class RichestCustomerWealth {

    public static void main(String ... args){

        int[][] accounts = {{1,5},{7,3},{3,5}};
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth+=accounts[i][j];
            }
            if(customerWealth >= maxWealth)
            {
                maxWealth = customerWealth;
            }
        }

        System.out.println(maxWealth);
    }

}
