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
public class MiniMaxSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            long e = in.nextLong();

            long[] sums = new long[5];

            sums[0] = b + c + d + e;
            sums[1] = a + c + d + e;
            sums[2] = a + b + d + e;
            sums[3] = a + b + c + e;
            sums[4] = a + b + c + d;

            long min = Long.MAX_VALUE;
            long max = 0;

            for (int i = 0; i < 5; i++) {
                if (sums[i] < min) {
                    min = sums[i];
                }

                if (sums[i] > max) {
                    max = sums[i];
                }
            }

            System.out.println(min + " " + max);

        }
    }

}
