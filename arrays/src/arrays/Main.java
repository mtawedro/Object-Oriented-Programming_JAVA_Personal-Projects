package arrays;

import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));

	String [] num= new String [10];
	int x=0;
	String convert;
	char one[]= new char[3];
	/*
	num[0]=(int)(1+Math.random()*(10));
	num[1]=(int)(1+Math.random()*(10));
	num[2]=(int)(1+Math.random()*(10));
	num[3]=(int)(1+Math.random()*(10));
	num[4]=(int)(1+Math.random()*(10));
	num[5]=(int)(1+Math.random()*(10));
	num[6]=(int)(1+Math.random()*(10));
	num[7]=(int)(1+Math.random()*(10));
	num[8]=(int)(1+Math.random()*(10));
	num[9]=(int)(1+Math.random()*(10));
	*/
	
	convert=(String)(1+Math.random()*(10));
	num[0]=(int)(1+Math.random()*(10));
	num[1]=(int)(1+Math.random()*(10));
	num[2]=(int)(1+Math.random()*(10));
	num[3]=(int)(1+Math.random()*(10));
	num[4]=(int)(1+Math.random()*(10));
	
	int test =20;
	char letter='A';
	char converttest= test.charAt(0);
	
	System.out.println("letter"+" "+ test);
	
	
//	while(x<=num.length-1)
	//{
	//System.out.println(num[++x]);	
	//}
	
 //OR
 /*
	 for(int y=0;y<=num.length-1;y++)
	{
		if(y==2)
		{
	 convert=  (char) ( num[y]); 
		convert = 'C';
		}
	 System.out.println(num[y]);
	}
	*/
}
	}