/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.algorithms;

import java.util.Scanner;

/**
 *
 * @author DMCT
 */
public class DesignerPDFViewer {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] sizeChars = new int[26];
            for (int i = 0; i < 26; i++) {
                sizeChars[i] = in.nextInt();
            }

            //Nosequestapasandoaquidoctor
            String word = in.next();
            int maxValue = 0;
            for (char c : word.toCharArray()) {
                if (sizeChars[c - 97] > maxValue) {
                    maxValue = sizeChars[c - 97];
                }
            }

            System.out.println(maxValue * word.length());
        }
    }
}
