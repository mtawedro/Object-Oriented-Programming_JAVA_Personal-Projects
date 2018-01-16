package file3;

import java.io.*;

class Main {
	public static void main(String[] args) {
		String Name = "c:\\FilesAndArrays\\file3\\reaper10.txt";
	PrintWriter out = null;
		
		try {
			
		out = new PrintWriter(new BufferedWriter(new FileWriter(Name,true)));
			
		out.println("Of travellers in some shady haunt,");
		out.println("Among Arabian sands.");
		} catch (IOException iox) {
			System.out.println("Problem writing " + Name);
		} 
		
		finally {
			if (out != null)
				out.close();
		}
	}// end of main
}//  end of class WriteTextFile3

String fileName = "numbers.txt" ;

String inputLine; 

StringTokenizer words; 

int total = 0; 

String oneNumber; 

int value; 

try

{ 

 BufferedReader in = new BufferedReader( new FileReader( fileName ) ); 

inputLine = in.readLine(); 

 

while ( inputLine != null ) // continue until end of file

 { 

 words = new StringTokenizer(inputLine, ",;"); // look for delimiters

 

 while(words.hasMoreTokens()) 

 { 

 oneNumber = words.nextToken();// gets the next number

 value = Integer.parseInt(oneNumber); 

 total += value; 

 } 

 System.out.println("The total is " + total); 

 total = 0; 

 inputLine = in.readLine(); 

 } 

in.close(); 

} 

catch ( IOException e ) 

{ 

 System.out.println("Problem reading " + fileName );