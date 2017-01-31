/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.ten.days.statistics;

import java.util.Scanner;

/**
 *
 * @author DMCT
 */
public class WeightedMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int size = in.nextInt();
            int[][] incidenceMatrix = new int[2][size];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < size; j++) {
                    incidenceMatrix[i][j] = in.nextInt();
                }
            }

            int xiwi = 0;
            int wi = 0;
            for (int i = 0; i < size; i++) {
                xiwi += incidenceMatrix[0][i] * incidenceMatrix[1][i];
                wi += incidenceMatrix[1][i];
            }


            double resultMean = xiwi*1.0 / wi*1.0;
            resultMean = Math.round(resultMean * 10);
            resultMean = resultMean / 10;
            System.out.println(resultMean);

        }
    }

}
