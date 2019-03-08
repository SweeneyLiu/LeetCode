package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/8.
 */
public class RotateArray189 {

    @Test
    public void test(){
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }

    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return;
        int tmp = k%nums.length;
        int start = 0;
        int end = nums.length-1;
        revert(0,nums.length-1-tmp,nums);
        revert(nums.length-tmp,end,nums);
        revert(0,end,nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    private void revert(int start,int end,int[]nums){
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
