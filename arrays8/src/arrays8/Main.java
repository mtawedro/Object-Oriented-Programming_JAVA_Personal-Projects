package arrays8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));

	String[]num=new String[8];
	
	num[0]="camel";
	num[1]="ant";
	num[2]="dog";
	num[3]="cat";
	num[4]="horse";
	num[5]="mule";
	num[6]="java";
	num[7]="goose";
	
	
	String temp;
	int j;
	boolean flag=true;
	
	while(flag)
	{
		flag=false;
		for(j=0;j<num.length-1;j++)
		{
			if(num[j].compareToIgnoreCase(num[j+1])>0)
			{
				temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
			flag=true;
			}
		}
	}
	
	for( j = 0; j < num.length -1; j++ )
	{
		System.out.println(num[j]);
	}
	
	
	
	
	
	}
	}