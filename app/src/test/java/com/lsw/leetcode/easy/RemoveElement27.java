package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/6.
 */
public class RemoveElement27 {

    @Test
    public void test(){
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }

    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
