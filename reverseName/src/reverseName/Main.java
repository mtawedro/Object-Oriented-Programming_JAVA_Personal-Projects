package reverseName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)
	
	
	{
		String s="Martina";
		int c= 0; //6
		name(s,c);// martina and 6

	}

public static int name( String s, int c)
{
	System.out.println(s.charAt(c)); //print letter at that position 
	
	if(c== s.length())// 6==1
	{
		return c;// return whatever number there is at that position 
	}

	else
	{
		
		return name(s, (c+1)); // ex, return string  subtract 1 from 6 then next will = at position 5
	
	}






}
}










