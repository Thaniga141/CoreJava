package Day2;

public class Practice3 {
		int gear=5;
		
		public void run() {
			
		System.out.println("bmw car is running");	
		}
		public void run1() {
			
			System.out.println("mg car is running");	
			}
	public void run2() {
		System.out.println("tuv car is running");	
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub

	Practice3 bmw = new Practice3();
	System.out.println("bmw car has "+bmw.gear  + " gears");
	bmw.run();
	
	Practice3 mg = new Practice3();
	System.out.println("bmw car has "+mg.gear  + " gears");
	mg.run1();
	
	Practice3 tuv = new  Practice3();
	System.out.println(tuv.gear);
tuv.run2();
	
	}

}
