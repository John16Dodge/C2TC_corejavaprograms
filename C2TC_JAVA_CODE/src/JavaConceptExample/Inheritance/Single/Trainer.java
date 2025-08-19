package JavaConceptExample.Inheritance.Single;

public class Trainer extends Person {
	private int tid;
	private String disignation;
	private String location;
	public Trainer(int pid, String name, String city, int tid, String disignation, String location) {
		super(pid, name, city);
		this.tid = tid;
		this.disignation = disignation;
		this.location = location;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getDisignation() {
		return disignation;
	}
	public void setDisignation(String disignation) {
		this.disignation = disignation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Person [pid=" + super.getPid() + ", name=" + super.getName() + ", city=" + super.getCity() + "]Trainer [tid=" + tid + ", disignation=" + disignation + ", location=" + location + "]";
	}
	
	
		
	
	

}
