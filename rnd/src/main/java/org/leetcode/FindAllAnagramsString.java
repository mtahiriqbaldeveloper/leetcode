package org.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsString {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> haveMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int leftPointer = 0;
        int rightPointer = 0;
        int matchCount = 0;

        // Create a frequency map for the characters in p
        for (char c : p.toCharArray()) {
            haveMap.put(c, haveMap.getOrDefault(c, 0) + 1);
        }

        int requiredMatchCount = haveMap.size();

        // Use the sliding window approach
        while (rightPointer < s.length()) {
            char c = s.charAt(rightPointer);
            if (haveMap.containsKey(c)) {
                windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

                if (windowMap.get(c).intValue() == haveMap.get(c).intValue()) {
                    matchCount++;
                }
            }

            // Shrink the window if its size is greater than p's length
            while (rightPointer - leftPointer + 1 > p.length()) {
                char leftChar = s.charAt(leftPointer);
                if (haveMap.containsKey(leftChar)) {
                    if (windowMap.get(leftChar).intValue() == haveMap.get(leftChar).intValue()) {
                        matchCount--;
                    }
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                }
                leftPointer++;
            }

            // If all characters match, record the start index
            if (matchCount == requiredMatchCount) {
                result.add(leftPointer);
            }

            rightPointer++;
        }

        return result;
    }
}