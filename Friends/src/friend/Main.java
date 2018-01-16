package friend;

import java.io.*;

class WriteTextFile3 {
	
public static void main(String[] args) {
	
	String filename= "friend1.txt";
	PrintWriter out=null;
	
	try{
		out= new PrintWriter(new BufferedWriter(new FileWriter(filename,true)));
	out.println("helpo");
	

	}

	catch(IOException hello)
	{
		System.out.println("Problem writing"+ filename);
	}

	finally
	{
	if(out!=null)
		out.close();
}










}
}