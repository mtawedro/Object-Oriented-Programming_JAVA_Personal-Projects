package file2;

import java.io.*;

class WriteTextFile3 {
	public static void main(String[] args) {
		String fileName = "c:\test\reaper2.txt";
		PrintWriter out = null;
		
		try {
			
			out = new PrintWriter(new BufferedWriter(new FileWriter(fileName,true)));
			out.println("No Nightingale did ever chaunt");
			out.println("More welcome notes to weary bands");
			out.println("Of travellers in some shady haunt,");
			out.println("Among Arabian sands.");
		} catch (IOException iox) {
			System.out.println("Problem writing " + fileName);
		} finally {
			if (out != null)
				out.close();
		}
	}// end of main
}// 