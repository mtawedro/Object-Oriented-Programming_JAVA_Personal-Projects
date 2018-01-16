package arrays9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));

	String[]num=new String[8];

	for(int j=0;j<num.length-1;j++)
	{	
		System.out.println("Enter your "+(j+1) +" friend");
		num[j]=myinput.readLine();
	}
	
	order(num);
	
	serch(num);
	}
	
	public static void order(String[] num)
	{//start of method
		String temp;
		boolean flag=true;
		
		while(flag)
		{//start of while
			flag=false;
			for( int x= 0; x< num.length -1; x++  )
			{//start of for
				if(num[x].compareToIgnoreCase(num[x+1])>0);
				{//start of if
				
					temp=num[x];
				
					num[x]=num[x+1];  
				
					num[x+1] =temp;
				
					flag=true;
				
				}//end of if
			}//end of for
		}//end of while.
	
	
	
		for( int j = 0; j < num.length -1; j++ )
		{//start of for
			System.out.println(num[j]);
		}//end of for
	
	
	
	}//end of method
	public static void serch(String[] num)
	{//start of method
		String key="oscar";
		int j=0;
		boolean flag=false;
		
		for(  j = 0; j <= num.length -1; j++ )
		{//start of for;
			if(num[j].equalsIgnoreCase(key))
			{//start of if.
				flag=true;
				break;
			}//end of if.
		
		}//end of for
			
		if(flag)
		{
			System.out.println("have found "+ num[j]+" at position"+ j);
		}
		else
			
			System.out.println("Data could not be found");
		
	
	
	
	
}}
	
	
	
	
	
	
	