/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.datastructures;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author samas
 */
public class SparseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            HashMap<String, Long> occurrences = new HashMap<>();

            int numberOfStrings = in.nextInt();
            for (int i = 0; i < numberOfStrings; i++) {
                
                String cadena = in.nextLine();
                if (occurrences.containsKey(cadena)) {
                    Long occurrence = occurrences.get(cadena);
                    occurrences.put(cadena, occurrence++);
                } else {
                    occurrences.put(cadena, 1L);
                }
            }

            int numberOfQueries = in.nextInt();
            Long[] queryResults = new Long[numberOfQueries];
            for (int j = 0; j < numberOfQueries; j++) {
                
                String query = in.nextLine();
                if (occurrences.containsKey(query)) {
                    queryResults[j] = occurrences.get(query);
                } else {
                    queryResults[j] = 0L;
                }
            }

            for (Long result : queryResults) {
                System.out.println(result);
            }

        }
    }

}
