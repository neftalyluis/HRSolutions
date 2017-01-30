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
public class AngryProfessor {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int caseUses = in.nextInt();
            for (int i = 0; i < caseUses; i++) {
                int numberStudents = in.nextInt();
                int cancellation = in.nextInt();
                int onTimeStudents = 0;
                for (int j = 0; j < numberStudents; j++) {
                    if (in.nextInt() < 1) {
                        onTimeStudents++;
                    }
                }

                if (onTimeStudents >= cancellation) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
