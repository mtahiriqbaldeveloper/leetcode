package org.leetcode;

import java.util.Hashtable;

public class ValidAnagram {

    public static void main(String ... args){
        String s = "ab"; String t = "a";
//        if(s.length()!=t.length()) return false;
        Hashtable<Character, Integer> charCount = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }


        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(charCount.containsKey(c) != false && charCount.get(c) !=0){
                charCount.put(c,charCount.get(c)-1);
            }
            else {
                System.out.println("false");
//                return false;
            }
        }

        System.out.println("true");
//            return true;





    }
}
