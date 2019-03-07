package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/7.
 */
public class SearchInsertPosition35 {
    @Test
    public void test(){
//        System.out.println(searchInsert(new int[]{1,3,5,6},5));
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<end){
            mid = (start+end)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        if (target<nums[start]){
            return start;
        }else if(target<nums[end]){
            return end;
        }else{
            return end+1;
        }
    }
}
