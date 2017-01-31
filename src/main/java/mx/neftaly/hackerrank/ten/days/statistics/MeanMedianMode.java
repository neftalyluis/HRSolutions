/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.ten.days.statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Neftaly Luis
 */
public class MeanMedianMode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Long> numbersList = new LinkedList<>();

        try (Scanner scan = new Scanner(System.in)) {
            int inputString = scan.nextInt();

            while (inputString != 0) {
                Long number = scan.nextLong();
                numbersList.add(number);
                inputString--;
            }

        }

        numbersList.sort(null);

        //mean
        int size = numbersList.size();
        Double sum = 0.0;
        for (Long num : numbersList) {
            sum = sum + num;
        }

        double resultMean = sum / size;
        resultMean = Math.round(resultMean * 10);
        resultMean = resultMean / 10;
        System.out.println(resultMean);

        //median
        int place = numbersList.size() / 2;
        double first = numbersList.get(place - 1);
        double second = numbersList.get(place);

        double resultMedian = (first + second) / 2;
        resultMedian = Math.round(resultMedian * 10);
        resultMedian = resultMedian / 10;
        System.out.println(resultMedian);

        //mode
        HashMap<Long, Long> map = new HashMap<>();

        long maxOcurrence = 1;

        for (Long number : numbersList) {
            Long value = map.get(number);
            if (value != null) {
                map.put(number, value + 1);
                if (value + 1 > maxOcurrence) {
                    maxOcurrence = value + 1;
                }
            } else {
                map.put(number, 1L);
            }

        }
        List<Long> sameOcurrenceList = new ArrayList<>();
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            if (entry.getValue().equals(maxOcurrence)) {
                sameOcurrenceList.add(entry.getKey());
            }
        }

        System.out.println(Collections.min(sameOcurrenceList));
    }
}
