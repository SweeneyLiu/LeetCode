package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/7.
 */
public class MaximumSubarray53 {
    @Test
    public void test(){
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int maxCurrent = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(maxCurrent+nums[i],nums[i]);
            max = Math.max(maxCurrent,max);
        }
        return max;
    }
}
