package com.lsw.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sweeneyliu on 2019/3/5.
 */
public class TwoSum1 {
    @Test
    public void testTwoSum(){
        System.out.println(Arrays.toString(twoSum(new int[]{3,5,4},7)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        int[] arr = new int[2];
        for(int i = 0;i<nums.length;i++){
            int value = target - nums[i];
            if(numMap.containsKey(value)){
                arr[0] = numMap.get(value);
                arr[1] = i;
                return arr;
            }else{
                numMap.put(nums[i],i);
            }
        }
        return arr;
    }
}
