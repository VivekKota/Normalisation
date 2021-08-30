package SingletonClass;

public class Main {

	public static void main(String[] args) {

		JDBCSingleton jdbc1 = JDBCSingleton.getInstance();
		System.out.println(jdbc1);
		
	
		JDBCSingleton jdbc2 = JDBCSingleton.getInstance();
		System.out.println(jdbc2);
		

		
		
		

	}

}
