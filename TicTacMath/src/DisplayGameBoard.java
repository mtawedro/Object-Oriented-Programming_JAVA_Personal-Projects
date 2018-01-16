
public class DisplayGameBoard 

{


int [ ] [ ] cells = { {1,2,3,4},

{5,6,7,8},

{9, 10, 11, 12},

{ 13,14,15,16},

{17,18,19,20} };

{
	
	for(int x =0; x<cells.length;x++)
   {
	   
	   for(int y=0; y<cells.length; y++ )
	   
	   {
		   System.out.println("/t" + cells[x][y]);
		  
		   if(cells[x][y]== cells[4][4])
		 
		   {
		  
			   System.out.println("----------------------");
			   
		   
		   }
		   
		   
		   //if(cells[x][y]== cells[4][4])
		   
		   
		   
		   
		   
	   }
	   
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}