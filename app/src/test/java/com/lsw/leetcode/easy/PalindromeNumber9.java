package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/6.
 */
public class PalindromeNumber9 {
    @Test
    public void test(){
        System.out.println(isPalindrome(121));
    }

    private boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int div = 1;
        while (x/div >= 10) {
            div = div*10;
        }
        while (x != 0) {
            if (x / div != x % 10) {
                return false;
            }
            x = x % div;
            x = x / 10;
            div = div / 100;
        }
        return true;
    }
}
