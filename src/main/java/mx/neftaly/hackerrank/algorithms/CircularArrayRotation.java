/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author samas
 */
public class CircularArrayRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            int size = in.nextInt();
            int rotations = in.nextInt();
            int queries = in.nextInt();

            int[] rotated = new int[rotations];
            int[] array = new int[size - rotations];

            for (int j = 0; j < size - rotations; j++) {
                array[j] = in.nextInt();
            }

            for (int i = 0; i < rotations; i++) {
                rotated[i] = in.nextInt();
            }

            for (int k = 0; k < queries; k++) {
                int query = in.nextInt();
                if (query > rotations - 1) {
                    System.out.println(array[query - rotations]);
                } else {
                    System.out.println(rotated[query]);
                }
            }

        }
    }
}
