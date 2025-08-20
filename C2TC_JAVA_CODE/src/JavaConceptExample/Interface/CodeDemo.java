package JavaConceptExample.Interface;

public class CodeDemo {

		public static void main (String[] args) {
			
			Coder c= new Student();
			c.codingWork();
			
			c=new Trainer();
			c.codingWork();
		}
}
