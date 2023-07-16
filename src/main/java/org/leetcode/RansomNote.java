package org.leetcode;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class RansomNote {

    public static void main(String ...args){
        String magazine = "qwertyaquisdfghrrjkt";
        String ransomNote= "rrq";
        char[] x = magazine.toCharArray();
        char[] y = ransomNote.toCharArray();

        int[] chs = new int[26];
        for(char ch : magazine.toCharArray()){
            chs[ch - 'a']++;
        }

      Arrays.stream(chs).forEach(System.out::println);


        Hashtable<Character,Integer> hashtable = new Hashtable<>();
        for (char c:x) {
            if(hashtable.containsKey(c)){
                hashtable.put(c,hashtable.get(c)+1);
            }else {
                hashtable.put(c,1);
            }
        }

        for (char c: y) {
            if(!hashtable.containsKey(c) || hashtable.get(c)<=0){
//                return false;
                System.out.println("false");
            }
            hashtable.put(c,hashtable.get(c)-1);
        }
//        return true;
        System.out.println("true");
    }

}
