package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/6.
 */
public class LongestCommonPrefix14 {
    @Test
    public void test(){
        String[] strings = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs != null && strs.length != 0) {
            String result = strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(result)!=0){
                    result = result.substring(0,result.length()-1);
                }
            }
            return result;
        }
        return "";
    }
}
