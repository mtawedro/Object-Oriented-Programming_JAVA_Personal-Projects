
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		int[]num={84, 69, 76, 86, 94, 91};
		int j = 0;
	
		//to find max value
		for(  j = 0; j < num.length -1; j++ )
		{
		if ( num[ j ] > num[ j+1] ) // change to > for ascending sort
		{
		int temp = num[ j ]; //swap elements
		num[ j ] = num[ j+1 ];
		num[ j+1 ] = temp;
		
		
		}
		
	}
	
		System.out.println(num[j]);


}}