package arrays6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));


		int[] caseNum={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		
		double[] amount={0.01,1,5,10,25,50,75,100,200,300,400,500,750,1000,5000,10000,50000,25000,75000,100000,200000,300000,400000,500000,750000,1000000};
	

		
		for(int x=0; x<caseNum.length-1;x++)
		{
			int y=(int)(1+Math.random()*(25));
			amount[x]=caseNum[y];
	
			System.out.println(amount[x]+caseNum[x]);
		
		}
		
		
		
		//int x;
	//int temp;
	//boolean flag=true;
	
	//while(flag)
	//{
	//	flag=false;
	//	for(x=0; x<num.length-1;x++)
	//{
		//if(num[x]< num[x+1])
	//	{
		//	temp=num[x];
		//	num[x]=num[x+1];
		//	num[x+1]=temp;
			//flag=true;
		//}
	
	//}
	
//	}
	
	//for( x = 0; x < num.length -1; x++ )
	//{
	//	System.out.println(num[x]);
	//}
	
	
	
	
	
	}
	}
	