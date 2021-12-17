package file;

import java.io.File;
import java.io.IOException;

public class Files_Method {

	public static void main(String[] args) throws IOException {
		
		File f = new File ( "/Users/Ali Al-Doori/Desktop", "Hello");
		
		
		f.createNewFile();
		
	System.out.println(f.canRead());	
	System.out.println(f.canExecute());	
	System.out.println(f.isDirectory());	
	System.out.println(f.isAbsolute());	
	System.out.println(f.isFile());	
	System.out.println(f.getName());	
	System.out.println(f.getPath());	
	
		
	}

}
