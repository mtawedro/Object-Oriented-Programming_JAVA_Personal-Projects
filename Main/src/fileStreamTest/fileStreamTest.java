package fileStreamTest;

import java.io.*;

public class fileStreamTest

{

   public static void main(String args[]){
   
   try{
      
      OutputStream os = new FileOutputStream("test.txt");
      for(int x=0; x < 11 ; x++)
      {
         os.write( "how many names do you want to enter" ); // writes the bytes
     
      
      }
      os.close();
     
      InputStream is = new FileInputStream("test.txt");
      int size = is.available();

      for(int i=0; i< size; i++){
         System.out.print((char)is.read() + "  ");
      }
      is.close();
   }catch(IOException e){
      System.out.print("Exception");
   }	
   }
}