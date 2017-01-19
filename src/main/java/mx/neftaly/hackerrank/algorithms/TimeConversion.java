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
public class TimeConversion {

    /**
     * MonkeyPatched, sawry :(
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        in.close();
        int hours = Integer.parseInt(date.substring(0, 2));
        if (date.substring(8).equals("PM") && hours != 12) {
            hours += 12;

            System.out.println(hours + date.substring(2, 8));
        } else if (date.substring(8).equals("AM") && hours == 12) {
            System.out.println("00" + date.substring(2, 8));
        } else if (hours < 10) {
            System.out.println("0" + hours + date.substring(2, 8));
        } else {
            System.out.println(hours + date.substring(2, 8));

        }

    }

}
