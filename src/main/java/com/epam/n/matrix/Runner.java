package com.epam.n.matrix;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by User on 08.06.2017.
 */
public class Runner {


    public static void main (String[] args) {

        MatrixFactory factory = new MatrixFactory();
        Matrix matrixA = factory.createMatrix(2, 2);
        System.out.println(matrixA);
        Matrix matrixB = factory.createMatrix(2, 2);
        System.out.println(matrixB);

        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        Matrix matrixC = matrixMultiplication.multiplicateMatrix(matrixA, matrixB);

        System.out.println(matrixC);
    }

}
