package file1;

import java.io.*;

class Main {
	public static void main(String[] args) {
		
		String fileName = "c:\\FilesAndArrays\\file3\\reaper10.txt";
		PrintWriter out = null;
		String adress;
		String state;
		int age;
		String sex;
		double salary;
		double savings;
		String car;
		int year;
		String name;
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		try {
			
			out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			
			//FileWriter writer= new FileWriter(fileName, true);
			
			for(int x=0; x<=8;x++)
			{
				System.out.println("Enter your name:");
				name=myinput.readLine();
			
				System.out.println(" Enter your adress:");
				adress= myinput.readLine();
		
				System.out.println("Enter the state:");
				state=myinput.readLine();
			
				System.out.println("Enter your age:");
				age=Integer.parseInt(myinput.readLine());
			
				System.out.println("Enter your sex:");
				sex=myinput.readLine();
			
				System.out.println("Enter your salary:");
				salary=Double.parseDouble(myinput.readLine());
			
				System.out.println("Enter your savings:");
				savings=Double.parseDouble(myinput.readLine());
			
				System.out.println("Enter your car:");
				car=myinput.readLine();
			
				System.out.println("Enter the year:");
				year=Integer.parseInt(myinput.readLine());
			
			out.println(name+" ,"+adress+" ,"+" ,"+ state+", "+age+", "+sex+","+ salary+", "+savings+", "+car+", "+year);
			
		
		
		
			}
			
		
} 
		
		catch (IOException iox) 
		
		{
			System.out.println("Problem writing " + fileName);
		} finally {
			if (out != null)
				out.close();
		}
	}// end of main
}//  end of class WriteTextFile3