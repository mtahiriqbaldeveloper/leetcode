package org.leetcode;


import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacter {
    public static void main(String ... args){

        String s = "leetcode";
        Hashtable<Character,Integer> characterCount = new Hashtable<>();
        int length = s.length();
        for (int i = 0; i <length ; i++) {
            char c = s.charAt(i);
            characterCount.put(c, characterCount.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < length; i++) {

            char c =s.charAt(i);
            if(characterCount.get(c) == 1){
                System.out.println(i);
//                return i;
            }
        }
        System.out.println(-1);
//        return -1;
    }

}
