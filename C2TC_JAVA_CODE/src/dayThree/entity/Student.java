package dayThree.entity;

public class Student {
	private int sid;
	 private String name;
	 
	 //default constructor
	 public Student() {
		 this(16,"Magesh");//calling parametrized constructor 
		 System.out.println("Constructor Called..");
	 }
	 
	 //parametrized constructor 
	 public Student(int sid, String sname) {
		 //this(); //calling default constructor
		 this.sid=sid;
		 this.name=name;
	 }

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	 
	 
}
