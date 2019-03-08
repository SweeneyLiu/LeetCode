package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/7.
 */
public class LengthOfLastWord58 {
    @Test
    public void test(){
        System.out.println(lengthOfLastWord(" a"));
    }

    public int lengthOfLastWord(String s) {
        if(s==null||s.trim().length() == 0) return 0;
        String[] ss = s.trim().split(" ");//去掉字符串前后空格以“ ”来划分字符串数组
        int len = ss.length; //字符串数组中数组的个数
        return ss[len - 1].length(); //返回最后一个数组的长度
    }
}
