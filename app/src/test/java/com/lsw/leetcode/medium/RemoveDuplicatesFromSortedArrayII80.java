package com.lsw.leetcode.medium;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/8.
 */
public class RemoveDuplicatesFromSortedArrayII80 {
    @Test
    public void test(){
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    public int removeDuplicates(int[] nums) {
        if(nums == null ) return 0;
        if(nums.length<=2) return nums.length;
        int loc = 2;
        for (int i = 2; i < nums.length; i++) {
            if(! ((nums[loc-2]==nums[loc-1])&&(nums[loc-1] == nums[i]))){
                nums[loc++] = nums[i];
            }
        }
        return loc;
    }
}
