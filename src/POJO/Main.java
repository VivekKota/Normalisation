package POJO;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee("Vivek", "123", 100000);
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		
		Immutable i1 = new Immutable("HEMPK");
		System.out.println(i1.getPancardNumber());
	}
}
