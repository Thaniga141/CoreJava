package Day2;

class Practice {

	  // field of class
	  int gear = 5;
      int wheels= 4;
	  // method of class
	  void braking() {
	    System.out.println("Sprots byke is running");
	  }
	
public static void main(String[] args) {
	
	// create object
	    Practice sportsBicycle = new Practice();
		Practice sportsCar = new Practice();

		// access field and method
		System.out.println(sportsBicycle.gear);
		System.out.println(sportsCar.gear);
		sportsBicycle.braking();
		System.out.println("The wheels of Sports car is: " +sportsCar.wheels);
}
	
}
