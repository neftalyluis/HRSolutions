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
public class SaveThePrisoner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int n = in.nextInt();
                int m = in.nextInt();
                int s = in.nextInt();

                if ((m + s - 1) % n == 0) {
                    System.out.println(n);
                } else {
                    System.out.println((m + s - 1) % n);
                }
            }
        }

    }
}
