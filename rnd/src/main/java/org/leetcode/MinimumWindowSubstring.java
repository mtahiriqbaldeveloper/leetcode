package org.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {

        String result = findMinimumWindow("ADOBECODEBANC", "ABC");
        System.out.println(result);

    }

    public static String findMinimumWindow(String s, String t) {
        if(t.isEmpty())
            return "";
        Map<Character, Integer> haveMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        int leftPointer = 0;
        int[] result = {-1, -1};
        for (char c : t.toCharArray()){
            haveMap.put(c, haveMap.getOrDefault(c, 0) + 1);
        }
        int have = 0;
        int need = haveMap.size();
        int resultLength = Integer.MAX_VALUE;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char currentChar = s.charAt(rightPointer);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            if (haveMap.containsKey(currentChar) && haveMap.get(currentChar).equals(windowMap.get(currentChar))) {
                have++;
            }

            while (need == have) {
                if ((rightPointer - leftPointer + 1) < resultLength) {
                    result[0] = leftPointer;
                    result[1] = rightPointer;
                    resultLength = (rightPointer - leftPointer + 1);
                }
                char leftChar = s.charAt(leftPointer);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (haveMap.containsKey(leftChar) && windowMap.get(leftChar) < haveMap.get(leftChar)) {
                    have--;
                }
                leftPointer++;
            }
        }

        return resultLength != Integer.MAX_VALUE ? s.substring(result[0], result[1] + 1) : "";
    }
}
