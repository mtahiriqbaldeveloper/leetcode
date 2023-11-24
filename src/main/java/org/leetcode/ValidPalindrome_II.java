package org.leetcode;

public class ValidPalindrome_II {

    public static void main(String ...args){

        String s = "deeee";
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while (leftPointer <= rightPointer){
            char leftChar = s.charAt(leftPointer);
            char rightChar = s.charAt(rightPointer);
            if(leftChar != rightChar){
                System.out.println(isValidPalindrome(s, leftPointer+1, rightPointer) || isValidPalindrome(s, leftPointer, rightPointer - 1));
                break;
            }
            leftPointer++;
            rightPointer--;
        }
        System.out.println("it's in palindrome");
    }

    public static boolean isValidPalindrome(String s, int leftIndex, int rightIndex){

        while (leftIndex <= rightIndex){
            if(s.charAt(leftIndex) != s.charAt(rightIndex)){
                return false;
            }
            rightIndex--;
            leftIndex++;
        }
        return true;
    }
}
