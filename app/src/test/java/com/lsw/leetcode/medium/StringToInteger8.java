package com.lsw.leetcode.medium;

import android.text.TextUtils;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/7.
 */
public class StringToInteger8 {
    @Test
    public void test(){
        System.out.println(myAtoi("-91283472332"));
    }

    public int myAtoi(String str) {
        if(str == null) return 0;
        str = str.trim();
        if(str.length() == 0) return 0;
        int sign = 1;
        int start = 0;
        long result = 0;
        char c = str.charAt(0);
        if(c == '+'){
            sign = 1;
            start++;
        }else if(c=='-'){
            sign = -1;
            start++;
        }
        for (int i = start; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) return (int)(result*sign);
            result = result*10+str.charAt(i)-'0';
            if(sign == 1 && result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && result >Integer.MAX_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(sign*result);
    }
}
