package org.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String ...args){

        int rows = 3;
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == i - 1 || j == 0) {

                    row.add(1);
                }
                else {
                    row.add(result.get(i-2).get(j) + result.get(i-2).get(j-1));
                }
            }
            result.add(row);
        }
//        return result;
    }
}
