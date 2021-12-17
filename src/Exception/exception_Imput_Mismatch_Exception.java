package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_Imput_Mismatch_Exception {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner ( System.in);
	try {
		System.out.println("Enter the numbers ");
		int x , y , z  ;
		x= input.nextInt();
		y= input.nextInt();
		
		
		
		z= x/y ;
		System.out.println(z);
		
	}catch ( InputMismatchException a) {
		
		
		System.out.println(a);
		
	}catch ( ArithmeticException e ) {
		System.out.println(e);
	}
	finally {
		input.close();
	}
	
	}
}
