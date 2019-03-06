package com.lsw.leetcode.easy;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by sweeneyliu on 2019/3/6.
 */
public class ValidParentheses20 {
    @Test
    public void test(){
        System.out.println(isValid("{[]}"));
    }

    public boolean isValid(String s) {
        if(s==null || s==""){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()) {
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else{
                if(stack.isEmpty()||!(stack.pop()==c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
