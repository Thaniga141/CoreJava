package Day2;

public class Assignment1 {
	int a = 18;
	float b = 177f;
	double c = 8.51;
	String d = "Thaniga";
	void add() {
		System.out.println(a+" "+d);
	}
	String sub() {
		return "Finished";
	}
	double multiply() {
		double e = a * c;
		return e;
	}

	public static void main(String[] args) {
		Assignment1 obj = new Assignment1();
		
		obj.add();
		
		String m = obj.sub();
		System.out.println(m);
		
		double f = obj.multiply();
		System.out.println(f);
		
		

	}

}
