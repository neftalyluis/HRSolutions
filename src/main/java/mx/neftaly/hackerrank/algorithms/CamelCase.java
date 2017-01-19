/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author samas
 */
public class CamelCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            List<Integer> cases = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    cases.add(i);
                }

            }
            cases.add(s.length());
            System.out.println(cases.size());
        }
    }

}
