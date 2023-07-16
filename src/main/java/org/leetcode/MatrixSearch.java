package org.leetcode;

public class MatrixSearch {

    public static void main(String ... args){

        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 12;
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            if(target >= matrix[i][0]){
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.println(matrix[i][j]);
                    if(target == matrix[i][j]){
                        result = true;
                        break;
                    }
                    else {
                        result = false;
                    }

                }
            }
        }

        System.out.println(result);
    }
}
