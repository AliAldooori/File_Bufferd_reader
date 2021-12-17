package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



public class File_writer_Reader {

	public static void main(String[] args) {
		
		File f = new File ("/Users/Ali Al-Doori","Leia.txt");
try {
		FileWriter  myfile = new FileWriter("/Users/Ali Al-Doori//Leia.txt");
		myfile.write("Hi Leia I pray to Gud for bless you ");
		myfile.flush();
		myfile.close();
		
		FileReader minfil = new FileReader("/Users/Ali Al-Doori//Leia.txt");
		int x;
		while ( ( x = minfil.read() ) != -1 )
		System.out.print((char )(x));
		
		minfil.close();
	}catch ( Exception e) {
		
		System.out.println(e);
	}
	}
}
