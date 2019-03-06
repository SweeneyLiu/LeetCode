package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/6.
 */
public class ReverseInteger7 {
    @Test
    public void testReverseInteger(){
        System.out.println(reverse(123));
    }

    public int reverse(int x) {
        long num = 0;
        while (x != 0) {
            num = num * 10 + x % 10;
            x = x / 10;
        }
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) num;
    }
}
