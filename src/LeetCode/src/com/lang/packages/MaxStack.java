package com.lang.packages;

import java.util.Stack;

class MaxStack {

    /** initialize your data structure here. */
	Stack<Integer> stack = null;
	Stack<Integer> max = null;
	
    public MaxStack() {
    	this.stack = new Stack<Integer>();
    	this.max = new Stack<Integer>();
    }
    
    public void push(int x) {
        
    	stack.push(x);
    	if(!max.isEmpty()) {
    		int curr = max.peek();
    		if(x >= curr)
    			max.push(x);
    	}else
    		max.push(x);
    }
    
    public int pop() {
    	int pop=0;
    	if(!stack.isEmpty()) {
    		pop = stack.pop();
    		Stack<Integer> temp = new Stack<Integer>();	
    		while(!max.isEmpty()) {   		
        		if(max.peek() == pop) {
        			max.pop();
        			break;
        		}else {
        			temp.push(max.pop());
        		}
        	}
    		
    		while(!temp.isEmpty()) {
        		max.push(temp.pop());
        		
        	}
    		
    	}
    	return pop;
    }
    
    public int top() {
    	int val=0;
    	if(!stack.isEmpty())
		 val = stack.peek();
        return val;
        
    }
    
    public int peekMax() {
    	int val=0;
    	if(!max.isEmpty())
		 val = max.peek();
        return val;
    }
    
    public int popMax() {
    	
    	int curr_max=0;
    	if(!max.isEmpty())
    	 curr_max = max.pop();
    	
    	Stack<Integer> temp = new Stack<Integer>();
    	while(!stack.isEmpty()) {   		
    		if(stack.peek() == curr_max) {
    			stack.pop();
    			break;
    		}else {
    			temp.push(stack.pop());
    		}
    	}
    	while(!temp.isEmpty()) {
    		int x = temp.pop();
    		stack.push(x);
    		if(!max.isEmpty()) {
        		int curr = max.peek();
        		if(x >= curr)
        			max.push(x);
        	}else
        		max.push(x);
    	}
    	
		return curr_max;
        
    }
}