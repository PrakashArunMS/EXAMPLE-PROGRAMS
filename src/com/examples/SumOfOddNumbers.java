package com.examples;

public class SumOfOddNumbers {
static int sum=0;
	public static void main(String[] args) {
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
				
			}
		}
		System.out.print("Sum of 1+3+5+7+9+..... is:"+sum);
	}

}
