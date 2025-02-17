package Day2;

import java.util.jar.Attributes.Name;

public class PracticeCons {
	String name;
	public PracticeCons() {
		System.out.println("Constructor");
		name = "Thaniga";
	}

	public static void main(String[] args) {
		PracticeCons obj = new PracticeCons();
		System.out.println("The name is" + obj.name);
	}

}
