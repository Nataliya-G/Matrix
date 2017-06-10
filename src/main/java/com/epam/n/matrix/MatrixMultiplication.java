package com.epam.n.matrix;

/**
 * Created by User on 09.06.2017.
 */
public class MatrixMultiplication {

    public Matrix multiplicateMatrix(Matrix m1, Matrix m2) {

        if (m1.m[0].length != m2.m.length) {
            System.out.println("Matrix is not consistent");
        } else {

            Matrix result = new Matrix();
            int[][] matrix = new int[m1.m.length][m2.m[0].length];
            for (int a = 0; a < m1.m.length; a++) {
                for (int n = 0; n < m2.m[0].length; n++) {
                    for (int i = 0; i < m2.m.length; i++)
                        matrix[a][n] += m1.m[a][i] * m2.m[i][n];

                }

            }
            result.m = matrix;
            return result;
        }

        return null;
    }
}