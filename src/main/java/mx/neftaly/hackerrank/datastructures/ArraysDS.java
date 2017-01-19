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
public class ArraysDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int size = in.nextInt();
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = in.nextInt();
            }

            String result = new String();
            for (int j = size - 1; j > -1; j--) {
                result = result.concat(Integer.toString(array[j]).concat(" "));
            }
            System.out.println(result.substring(0, result.length() - 1));

        }
    }

}
