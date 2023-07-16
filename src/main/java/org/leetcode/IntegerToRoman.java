package org.leetcode;

import java.sql.SQLOutput;

public class IntegerToRoman {

    public static void main(String ... args){
            int num = 17;
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[]={"","M","MM","MMM"};
        System.out.println(ths[num/1000] + " == ths");
        System.out.println(hrns[(num%1000)/100] + " == hrns");
        System.out.println(tens[(num%100)/10] + " == tens");
        System.out.println(ones[num%10]+ " == ones");

        System.out.println(ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10]) ;

        System.out.println(romanToInt("XVII"));
    }


    public static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}
