package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/7.
 */
public class ImplementStrStr28 {
    @Test
    public void test(){
        System.out.println(strStr("hello","ll"));
    }

    public int strStr(String haystack, String needle) {
        if(haystack==null || needle == null) return 0;
        return haystack.indexOf(needle);
    }
}
