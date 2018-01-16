package arrays7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));

	char[]num=new char[10];
	
	num[0]='a';
	num[1]='g';
	num[2]='k';
	num[3]='j';
	num[4]='t';
	num[5]='i';
	num[6]='f';
	num[7]='s';
	num[8]='w';
	num[9]='b';
	int j;
	boolean flag = true; // set flag to true to begin first pass
	char temp; //holding variable
	while ( flag )
	{
	flag= false; //set flag to false awaiting a possible swap
	for( j = 0; j < num.length -1; j++ )
	{
	if ( num[ j ] > num[ j+1] ) // change to > for ascending sort
	{
	
		temp = num[ j ]; //swap elements
	
		num[ j ] = num[ j+1 ];
	
		num[ j+1 ] = temp;
	
		flag = true; //shows a swap occurred
	}
	}
	}
	
	for( j = 0; j < num.length -1; j++ )
	{
		System.out.println(num[j]);
	}
	
	
	
	
	
	
	
	}}
