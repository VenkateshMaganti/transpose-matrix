package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        //Put your code here
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] temp = new int[col][row];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                temp[j][i] = matrix[i][j];
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
