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
public class PlusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int size = scan.nextInt();

            int pos = 0, neg = 0, zero = 0;

            for (int i = 0; i < size; i++) {
                int number = scan.nextInt();
                if (number == 0) {
                    zero++;
                } else if (number > 0) {
                    pos++;
                } else {
                    neg++;
                }
            }
//http://stackoverflow.com/questions/7220681/division-of-integers-in-java
            System.out.println((double) pos / size);
            System.out.println((double) neg / size);
            System.out.println((double) zero / size);

        }

    }

}
