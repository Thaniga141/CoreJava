package Day2;

public class Mproject2 {

	static   int s = 10;
	//create a method
	public int addNumb(int a,int b) {
	int	Sum = a+b;
		
		return Sum;
		}
	public void run() {
		System.out.println("i am running ");
	
		}
	public static int getTable(int x) {
		
		return x*3;
	}
	
	public int mulTwo(int c,int d) {
	int mul = c*d;
		
		return mul;
		
		
	}
	
	
	public static void main(String[] args) {

		//System.out.println("square root of 16 is:" + Math.sqrt(16));
		System.out.println(Mproject2.s);
		
		Mproject2 m = new Mproject2();
	int result =	m.addNumb(10, 20);
	System.out.println(result);
	 int r= m.mulTwo(10, 30);
	 System.out.println(r);
	 m.run();
	 for(int i=1;i<=10;i++) 
	 {
	int v = getTable(i);
	System.out.println(v);
	 }

	}

}

