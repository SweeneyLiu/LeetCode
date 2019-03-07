package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/7.
 */
public class CountAndSay38 {
    @Test
    public void test(){
        System.out.println(countAndSay(6));
    }

    public String countAndSay(int n) {
        if(n<=0) return "";
        String str = "1";
        for (int i = 1; i < n; i++) {
            int count = 0;
            char pre = '.';
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == pre || pre == '.'){
                    count++;
                }else{
                    stringBuilder.append(count+String.valueOf(pre));
                    count = 1;
                }
                pre = str.charAt(j);
            }
            stringBuilder.append(count+String.valueOf(pre));
            str = stringBuilder.toString();
        }
        return str;
    }
}
