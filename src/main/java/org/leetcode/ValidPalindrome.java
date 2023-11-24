package org.leetcode;


/**
 * <B>Leetcode Problem no<B/>: 125
 * Problem Type: Two Pointer
 * Difficulty Level: easy
 */
public class ValidPalindrome {

    public static void main(String ...args){

//        String s = "";
//        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//        int leftPointer = 0;
//        int rightPointer = s.length()-1;
//        boolean isValidPalindrome = true;
//        while (leftPointer < rightPointer){
//           if(s.charAt(leftPointer) != s.charAt(rightPointer)){
//               isValidPalindrome = false;
//            } leftPointer++; rightPointer--;
//        }
//
//        System.out.println("this is validPalindrome = " + isValidPalindrome);

        String s = "A man, a plan, a canal: Panama";
        int leftPointer = 0;
        int rightPointer = s.length()-1;

        while (leftPointer < rightPointer){
            char leftChar = s.charAt(leftPointer);
            char rightChar = s.charAt(rightPointer);
            if(!Character.isLetterOrDigit(leftChar)){
                leftPointer++;
            }else if(!Character.isLetterOrDigit(rightChar)){
                rightPointer--;
            }else {
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    System.out.println("it's not palindrome");
                    break;
//                    return false;
                }
                leftPointer++;
                rightPointer--;
            }

        }
        System.out.println("it's in palindrome");
//        return true;
    }

}
