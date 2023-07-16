package org.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpiralMatrixPrint {

    public static List<Integer> main(String... main) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        if(matrix.length == 0){
            return Collections.emptyList();
        }

        List<Integer> numbers = new ArrayList<>();
        int top = 0;

        int bottom = matrix.length - 1;

        int right = matrix[0].length - 1;

        int left = 0;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                numbers.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                numbers.add(matrix[i][right]);
            }

            right--;

            if(top <= bottom) {

                for (int i = right; i >= left; i--) {
                    numbers.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if(left<=right){
                for (int i = bottom; i >= top ; i--) {
                    numbers.add(matrix[i][left]);
                }
            }
            left++;

        }

        return numbers;

    }

}
