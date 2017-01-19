/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.datastructures;

import java.util.Scanner;

/**
 *
 * @author samas
 */
public class ArraysDS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        try (Scanner in = new Scanner(System.in)) {

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    arr[i][j] = in.nextInt();
                }
            }

            int max = Integer.MIN_VALUE;

            for (int k = 0; k < 4; k++) {
                for (int l = 0; l < 4; l++) {
                    int hourGlass
                            = arr[k][l] + arr[k][l + 1] + arr[k][l + 2]
                            + arr[k + 1][l + 1]
                            + arr[k + 2][l] + arr[k + 2][l + 1] + arr[k + 2][l + 2];
                    if (hourGlass > max) {
                        max = hourGlass;
                    }
                }
            }
            
            System.out.println(max);

        }

    }
}
