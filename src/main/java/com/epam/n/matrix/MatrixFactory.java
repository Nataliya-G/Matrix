package com.epam.n.matrix;

/**
 * Created by User on 08.06.2017.
 */
public class MatrixFactory {


    public Matrix createMatrix(int rows, int columns) {

        Matrix mat = new Matrix();

        int[][] a = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int m = 0; m < columns; m++) {
                a[i][m] = (int) (Math.random() * 100);
            }
        }

        mat.m = a;

        return mat;
    }

}

