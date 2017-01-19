/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.algorithms;

import java.util.Scanner;

/**
 *
 * @author samas
 */
public class DiagonalDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int size = scan.nextInt();
            int sizeSquared = size * size;

            int[] matrix = new int[sizeSquared];

            for (int k = 0; k < sizeSquared; k++) {
                matrix[k] = scan.nextInt();
            }

            int[] minusOne = new int[size];
            int[] plusOne = new int[size];

            int minusOneResult = 0;
            int plusOneResult = 0;

            for (int i = 0; i < size; i++) {
                minusOne[i] = (size - 1) * (i + 1);
                plusOne[i] = (size + 1) * i;
            }

            for (int l = 0; l < size; l++) {
                minusOneResult += matrix[minusOne[l]];
                plusOneResult += matrix[plusOne[l]];
            }

            System.out.println(Math.abs(plusOneResult - minusOneResult));
        }
    }

}
