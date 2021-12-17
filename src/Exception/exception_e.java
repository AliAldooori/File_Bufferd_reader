package Exception;

public class exception_e {

	public static void main(String[] args) {

		try {
			int x =5, y =0, z =x/y;
			
			System.out.println(z);
			
			
			
		}catch (Exception e ) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
			
			
		}
		
	}

}
