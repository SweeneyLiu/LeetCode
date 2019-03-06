package com.lsw.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sweeneyliu on 2019/3/6.
 */
public class RemoveDuplicatesFromSortedArray26 {
    @Test
    public void test(){
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]!=nums[i]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
