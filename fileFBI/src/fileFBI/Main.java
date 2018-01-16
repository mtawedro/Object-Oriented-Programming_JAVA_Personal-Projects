package fileFBI;




	import java.io.IOException;
	import java.nio.file.Path;
	import java.nio.file.Paths;

	public class Main {
	  public static void main(String[] args) throws IOException {
	    String input = FilesUtil.readTextFile("file.txt");
	    System.out.println(input);
	    FilesUtil.writeToTextFile("copy.txt", input);
	    
	    System.out.println(FilesUtil.readTextFile("copy.txt"));
	    
	    FilesUtil.readTextFileByLines("file.txt");
	    Path path = Paths.get("file.txt");
	  }
	}
















