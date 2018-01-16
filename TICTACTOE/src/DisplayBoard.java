public class DisplayBoard {

	//constructor 1
	public  DisplayBoard()
	
	{
		
	}
	
   //prints cells with labeled numbers
	public void PrintCells()
	
	{
		String[ ][ ]cells= {

				{ " 1", "2", "3", "4"},

				{ "5" ,"6", "7", "8"},

				{ "9", "10","11","12" },

				{ "13", "14", "15", "16" }};
		

						for(int r=0; r<cells.length;r++)

						{
							

							for(int c=0; c<cells[0].length;c++) 

							{
								System.out.print("\t" + cells[r][c]);
							
								
								//line is drew at the edges of the boards (col)
								if(c ==0 ||c ==1 ||c ==2 ||c ==3)
								{
									System.out.print("|");
								}
							
							} //end of first for
							
							
							//prints boarer line at the bottom edges (row)
							if( r==0 ||r ==1 ||r ==2)
							
							{
								System.out.println( "\n------------------------------------------------\n");
							}

							

							
						}//end of second for


	
	}

	
			//prints cells GameBaord WITHOUT numbers 
			public void PrintCells2(String cells[][])
			
			{
			
			
				System.out.println();
			
			
			
			
				for(int r=0; r<cells.length;r++)
		
			
				{
				
		
				
					for(int c=0; c<cells[0].length;c++) 
		
				
					{
					
						System.out.print("\t" + cells[r][c]);
				
					
						if(c ==0 ||c ==1 ||c ==2 ||c ==3)
					
						{
						System.out.print("|");
					
						}
				
				
					} //end of first for
				
				
					if( r==0 ||r ==1 ||r ==2)
				
					{
					
						System.out.println( "\n------------------------------------------------\n");
				
					}
		
				
				
			}//end of second for
			
		}
		

}
