package arrays3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));

	int [] num= new int [10];
	int x;
	double totalA;
	
	for(x=0;x<=num.length-1;x++)
	{
	num[x]=(int)(1+Math.random()*(10));
	System.out.println(num[x]);
	
	}
	
		System.out.println("first number:"+num[0]+" second number:"+num[9]);
		average(num);
		totalA=average(num);
		System.out.println("total Average is "+totalA);
	}
		public static double average(int[]num)
		{
			double average=0;
			int x;
			for( x=0;x<=num.length-1;x++)
			{
			average+=num[x];
			
			}
			average/=x;
			return average;
			
			
			
		}
	
	
	
	
	
	}
	
	
	
	
