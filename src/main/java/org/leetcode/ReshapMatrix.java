package org.leetcode;

import java.util.Arrays;

public class ReshapMatrix {
    public static void main(String ... args){

        int[][] mat = {{1,2,3},{3,4,3}};

        int r = 2;
        int c = 3;
        int[][] reshapeMatrix = new int[r][c];
        int nR = 0;
        int nC = 0;

        if(mat.length * mat[0].length != r*c){

        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                reshapeMatrix[nR][nC]=mat[i][j];
                nC++;
                if(nC == c){
                    nC =0;
                    nR++;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(reshapeMatrix[i][j]);
            }
            System.out.println("===");
        }
    }
}
