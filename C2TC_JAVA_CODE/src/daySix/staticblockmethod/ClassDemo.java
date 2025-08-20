package daySix.staticblockmethod;

public class ClassDemo {
	public static void main(String[] args) {

		Class o1 = new Class();
		System.out.println(o1);
		// static method with class name
		Class.display();

		Class o2 = new Class();
		System.out.println(o2);
		Class.display();
		
		Class o3 = new Class();
		System.out.println(o3);
		Class.display();

	}

}
