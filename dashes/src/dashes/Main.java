package dashes;

public class Main
{

	public static void main(String[] args){


String word="automobile";
int x= 1;
//word.charAt(i++);


//for(int x=1; x<=10;x++)
//{
	int Hello;
dashes(x);
	
	//System.out.print(x +" ");
	
	//System.out.print(word.charAt(x)+ "-");

}
 public static int dashes(int x)
{
	

if(x==11)

	return 1; // return number at that position 

else
{
	System.out.print(x);
	System.out.print(" ");
	return dashes((x+1));
}
	//System.out.print(word.charAt(c)+"-");
	//char h= word.charAt(c);
	//h+= (char)'-';
	//System.out.print(h);
	//return dashes((c+1),word);


//}
	}}