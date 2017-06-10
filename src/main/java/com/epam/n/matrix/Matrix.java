package com.epam.n.matrix;

import java.util.Arrays;

/**
 * Created by User on 08.06.2017.
 */
public class Matrix {

    int[][] m;

    @Override
    public String toString() {
        String s = "";
        for (int r = 0; r < this.m.length; r++) {
            for (int c = 0; c < this.m[0].length; c++) {
                s = s + this.m[r][c] + " ";
            }
            s=s+"\n";

        }
        return s;
    }

}