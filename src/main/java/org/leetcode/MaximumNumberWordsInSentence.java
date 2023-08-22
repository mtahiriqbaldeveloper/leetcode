package org.leetcode;


/**
 *<B>Leetcode Problem no<B/>: 1672,
 *Problem Type: Array,
 *Difficulty Level: easy
 */
public class MaximumNumberWordsInSentence {

    public static void main(String ... args){

        String[] sentences = {"please wait", "continue to fight", "continue to win"};

        int maxWordCount = 0;
        for (String s:sentences) {
            int length = s.split(" ").length;
            if(maxWordCount < length){
                maxWordCount = length;
            }
        }
        System.out.println(maxWordCount);
    }
}
