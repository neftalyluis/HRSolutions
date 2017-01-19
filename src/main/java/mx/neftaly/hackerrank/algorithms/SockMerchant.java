/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author samas
 */
public class SockMerchant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int numberOfSocks = in.nextInt();

            HashMap<Integer, Integer> colorsMap = new HashMap<>();

            for (int colorsIndex = 0; colorsIndex < numberOfSocks; colorsIndex++) {
                int color = in.nextInt();
                if (colorsMap.containsKey(color)) {
                    int number = colorsMap.get(color) + 1;
                    colorsMap.put(color, number);
                } else {
                    colorsMap.put(color, 1);
                }
            }

            int result = 0;
            for (int entry : colorsMap.values()) {
                result += entry / 2;
            }
            System.out.println(result);
        }
    }

}
