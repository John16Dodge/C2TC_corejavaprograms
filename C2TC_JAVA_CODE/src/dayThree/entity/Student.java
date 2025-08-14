package dayThree.entity;

public class Student {
	private int sid;
	 private String name;
	 
	 //default constructor
	 public Student() {
		 this(16,"Magesh");
		 System.out.println("Constructor Called..");
	 }
	 
	 //parametrized constructor 
	 public Student(int sid, String sname) {
		 //this();
		 this.sid=sid;
		 this.name=name;
	 }

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	 
	 
}
