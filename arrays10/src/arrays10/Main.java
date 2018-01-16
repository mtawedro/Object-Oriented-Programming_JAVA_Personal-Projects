package arrays10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));

	double[]num=new double[5];
	double temp;
	num[0]=43.2;
	num[1]=13.6;
	num[2]=91.4;
	num[3]=23.6;
	num[4]=72.1;
	
	for(int x=0;x<=num.length-1;x++)
	{
		for(int j=x+1;j<=num.length-1;j++)
		
		{
			if(num[x]>num[j])
			{
				temp=num[x];
			num[x]=num[j];
			num[j]=temp;
			//System.out.println(num[j]);
			}
	}
	
	}
	
	for( int j = 0; j < num.length -1; j++ )
	{//start of for
		System.out.println(num[j]);
	}//end of for
	
	
	
	
	
	}}