package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/6.
 */
public class RomanToInteger13 {

    @Test
    public void testReverseInteger(){
        System.out.println(romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int result = 0;
        char[] roman = s.toCharArray();
        for (int i = 0; i < roman.length; i++) {
            switch (roman[i]) {
                case 'I':
                    result = result + 1;
                    break;
                case 'V':
                    result = result + 5;
                    break;
                case 'X':
                    result = result + 10;
                    break;
                case 'L':
                    result = result + 50;
                    break;
                case 'C':
                    result = result + 100;
                    break;
                case 'D':
                    result = result + 500;
                    break;
                case 'M':
                    result = result + 1000;
                    break;
                default:
                    break;
            }
        }
        if(s.indexOf("IV")!=-1){
            result = result - 2*1;
        }
        if(s.indexOf("IX")!=-1){
            result = result - 2*1;
        }
        if(s.indexOf("XL")!=-1){
            result = result - 2*10;
        }
        if(s.indexOf("XC")!=-1){
            result = result - 2*10;
        }
        if(s.indexOf("CD")!=-1){
            result = result - 2*100;
        }
        if(s.indexOf("CM")!=-1){
            result = result - 2*100;
        }

        return result;
    }
}
