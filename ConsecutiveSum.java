package com.test.study;

public class ConsecutiveSum {
	
		public static void main(String[] args) {
			
			consecutive(10);
		}
		
		static int consecutive(long num){
		
			int i=0,j=0,count=0,sum=0;
			
			for(i=1;i<num;i++)
			{
				for (j=i; j<num;j++) {
					sum+=j;
					if(sum==num)
					{
						count++;
						break;
					}
					
				}
				sum=0;
				
			}
			
			return count;
		}
	

}
