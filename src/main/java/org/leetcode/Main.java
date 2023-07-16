package org.leetcode;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String x = "ab";
        String y = "bbhaa";
        System.out.println(y.compareToIgnoreCase(y));
        int n = 3;
        List<String> fizzWords = new ArrayList<>();

        int index=0;
        for(int i = 1; i <= n; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                fizzWords.add(index,"FizzBuzz");
                System.out.println("both");
            } else if (i % 5 == 0) {
                fizzWords.add(index,"Buzz");

            } else if (i % 3 == 0) {
                fizzWords.add(index,"Fizz");
            }
            else {
                fizzWords.add(index,String.valueOf(i));
            }
            index++;
        }


        fizzWords.forEach(System.out::println);
    }

}