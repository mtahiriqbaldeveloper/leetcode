package org.leetcode;

public class IsSubsequence {

    public static void main(String ...args){

        String s = "abc";
        String t = "ahbgdc";
        int sourceStringPointer = 0;
        int findStringPointer = 0;
        if(s.length() == 0 || t.length() == 0){
            System.out.println("false");
        }

        for (int i =0; i < t.length(); i++){
            if(t.charAt(sourceStringPointer) == s.charAt(findStringPointer)){
                findStringPointer++;
                sourceStringPointer++;
                if(findStringPointer == s.length()){
                    System.out.println("true");
                    break;
                }
            }else {
                sourceStringPointer++;
            }
        }

        System.out.println("false");
    }
}
