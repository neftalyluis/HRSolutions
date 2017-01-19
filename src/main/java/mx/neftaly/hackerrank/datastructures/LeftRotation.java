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
public class LeftRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            int size = in.nextInt();
            int rotations = in.nextInt();

            int[] rotated = new int[rotations];
            int[] array = new int[size - rotations];

            for (int i = 0; i < rotations; i++) {
                rotated[i] = in.nextInt();
            }

            for (int j = 0; j < size - rotations; j++) {
                array[j] = in.nextInt();
            }

            StringBuilder result = new StringBuilder();

            for (int k = 0; k < size - rotations; k++) {
                result.append(array[k]).append(" ");
            }

            for (int l = 0; l < rotations; l++) {
                result.append(rotated[l]).append(" ");
            }

            System.out.println(result.deleteCharAt(result.length() - 1));
        }
    }

}
