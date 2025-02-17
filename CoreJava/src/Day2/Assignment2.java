package Day2;

public class Assignment2 {
	//non - static variable
	int id = 18;
	String name = "Kalanidhi";
	
	//static variable
	static int no = 101;
	static float no1 = 25.3f;
	
	//static method
	static String name1() {
		return "Training";
	}
	static int rollno() {
		return 77;
	}
	
	//non -static method
	int div() {
		int a = 102;
		int b = 6;
		int c = a/b;
		return c;
	}
	String react() {
		return "React is Done";
	}

	public static void main(String[] args) {
		 
		//static variable calling
		System.out.println(Assignment2.no);
		System.out.println(Assignment2.no1);
		
		//static method calling
		String nm = Assignment2.name1();
		System.out.println(nm);
		int nm1 = Assignment2.rollno();
		System.out.println(nm1);
				
		//creating object for instance variables and methods
		Assignment2 obj = new Assignment2();
		
		//not - static variable calling
		System.out.println(obj.id);
		System.out.println(obj.name);
		
		//non - static method calling
		int ab = obj.div();
		System.out.println(ab);
		String ab1 = obj.react();
		System.out.println(ab1);
		
		
		

	}

}
