package com.lang.packages;

import java.util.Collections;
import java.util.PriorityQueue;

public class thirdMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2};
		System.out.print(thirdMax1(arr));
	}
	
	public static int thirdMax1(int[] nums) {
        
		if(nums.length==0) return -1;
		if(nums.length==1) return nums[0];
		if(nums.length==2) return Math.max(nums[0], nums[1]);
		
		 PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
	        for(int num: nums){
	            if(!pq.contains(num)){
	                pq.offer(num);
	                if(pq.size()>3)
	                pq.poll();
	            }
	        }
	        if(pq.size()<3){
	            while(pq.size()>1){
	                pq.poll();
	            }
	        }
	        return pq.peek();
    }
}
