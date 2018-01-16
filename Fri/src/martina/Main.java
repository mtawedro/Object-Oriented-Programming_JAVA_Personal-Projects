package martina;

import java.io.*;

class Main 
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		
		String first;
		String last;
		double age;
		double num;
		
		System.out.println("enter your friends first name");
		first=myinput.readLine();
		System.out.println("enter your friends last name");
		last=myinput.readLine();
		System.out.println("enter your friends age");
		age=Double.parseDouble(myinput.readLine());
		System.out.println("enter your friends phone number");
		num=Double.parseDouble(myinput.readLine());
		
		String fileName = "c:\\FilesAndArrays\\friends.txt";
		PrintWriter out = null;
		
	
		try {
			
			out = new PrintWriter(new BufferedWriter(new FileWriter(fileName,true)));
			out.println(first);
			out.println(last);
			out.println(age);
			out.println(num);
		} catch (IOException iox) {
			System.out.println("Problem writing " + fileName);
		} finally {
			if (out != null)
				out.close();
	}
	}// end of main
}//  end of class Writ