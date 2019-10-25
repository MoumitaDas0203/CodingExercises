package com.lang.packages;

import java.util.Stack;

class MinStack {


    /** initialize your data structure here. */
    
   Stack<Integer> stack = null;
   Stack<Integer> minStack = null;
   int min;
    
    public MinStack() {
        
       this.stack = new Stack<Integer>();
       this.minStack = new Stack<Integer>();
       this.min = Integer.MAX_VALUE;
  
    }
    
    public void push(int x) {
        
        if(stack != null){
            stack.push(x);
        }
        if(minStack.isEmpty())
        	min = Math.min(Integer.MAX_VALUE,x);
        else
        	min = Math.min(minStack.peek(),x);
       
        minStack.push(min);   
        
    }
    
    public void pop() {
        
        if(stack != null){
           stack.pop();
        }
         if(minStack != null) {
        	 minStack.pop();
         }
    }
    
    public int top() {
        
        int num = stack.peek();
        return num;
    }
    
    public int getMin() {
        
        return minStack.peek();
        
    }
}
