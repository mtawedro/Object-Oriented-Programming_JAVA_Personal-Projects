package tokens;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 

{


	public static void main(String[] args)
	
	{
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
String Filename = "456,123,101112,789";
StringTokenizer words;
int total = 0; 
String oneNumber; 
int value;
String num;
int convert;
int x=0;
int average;
int lowest=0 ;
int highest=0;
words = new StringTokenizer(Filename, ","); // look for delimiters
int [] nums= new int[4]; 

while(words.hasMoreTokens())

{
	num= words.nextToken();
	convert = Integer.parseInt(num);
	nums[x]=convert;
	total += nums[x];
	x++;
}

average=total/x;
System.out.println("sum:" + average);

for(int i=0; i<=nums.length-1;i++)
{
	
	
	if(nums[i++]<nums[i])
	{
		lowest=nums[i];
	}
	
	else //if(nums[i]>nums[i--])
	{
		highest=nums[i];
	}
	
	
}
	
System.out.println(" lowest num:" + lowest );
System.out.println(" highest num:" + highest );













}
}