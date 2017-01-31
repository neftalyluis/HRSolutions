/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Incomplete
 * @author DMCT
 */
public class BeautifulDaysAtMovies {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            int rangeOnI = in.nextInt();
            int rangeOnJ = in.nextInt();
            int divisible = in.nextInt();
            int beautifulNumbers = 0;
            for (int i = rangeOnI; i < rangeOnJ + 1; i++) {
                int toReverse = i;
                int reversed = 0;

                while (toReverse != 0) {
                    reversed = reversed * 10;
                    reversed = reversed + toReverse % 10;
                    toReverse = toReverse / 10;
                }

                if ((i - reversed) % divisible != 0) {
                    beautifulNumbers++;
                }
            }

            System.out.println(beautifulNumbers);
        }
    }
}
