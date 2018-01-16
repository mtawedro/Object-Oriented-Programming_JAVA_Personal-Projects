package helloo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class WriteTextFile3 {
	public static void main(String[] args) {
		String Name = "c:\\test\\reaper11.txt";
		PrintWriter out = null;
		
		try {
			
			out = new PrintWriter(new BufferedWriter(new FileWriter(Name)));
			
			out.println("tawedrous");
			out.println("martina");
			out.println("tawedrous");
			out.println("john.");
		} catch (IOException iox) {
			System.out.println("Problem writing " + Name);
		} 
		
		finally {
			if (out != null)
				out.close();
		}
	}// end of main
}//  end of class WriteTextFile3
