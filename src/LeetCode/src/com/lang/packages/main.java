package com.lang.packages;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MinStack obj = new MinStack();
//		obj.push(2147483646);
//		obj.push(2147483646);
//		obj.push(2147483647);
//		System.out.println(obj.top());
//		obj.pop();
//		System.out.println("null");
//		System.out.println(obj.getMin());
//		obj.pop();
//		System.out.println("null");
//		System.out.println(obj.getMin());
//		obj.pop();
//		System.out.println("null");
//		obj.push(2147483647);
//		System.out.println(obj.top());
//		System.out.print(obj.getMin());
//		obj.push(-2147483648);
//		System.out.println(obj.top());
//		System.out.println(obj.getMin());
//		obj.pop();
//		System.out.println("null");
//		System.out.println(obj.getMin());
		
		MaxStack obj = new MaxStack();
		 obj.push(5);
		 System.out.print("null");
		 obj.push(1);
		 System.out.print("null");
		 obj.push(5);
		 System.out.print("null");
		 int param_12 = obj.top();
		 System.out.print(param_12);
		 int param_2 = obj.popMax();
		 System.out.print(param_2);
		 int param_3 = obj.top();
		 System.out.print(param_3);
		 int param_4 = obj.peekMax();
		 System.out.print(param_4);
		 int param_5 = obj.pop();
		 System.out.print(param_5);
		 int param_6 = obj.top();
		 System.out.print(param_6);
		
	}

}
