package IATE;

public class Main {

	public static void main(String[] args)
	
	{
		
		String []num= new String[10];
		num[0]="5";
		num[1]="10";
		num[2]="37";
		num[3]="90";
		for(int y=0; y<num.length-1;y++) // prints array
			
		{
			if(y==2)
			{
				num[y]="D";
			}
			
			System.out.println(num[y]);
			
			//int name=(int)(0 + Math.random( ) * (6 - 0 + 1));
			// num[y]=  Integer.toString(name);
		}
		
		
		
		
		
	}

}
