package Day2;

public class Core2 {
	int a = 10;
	String abc = "Thaniga";
	void speak() {
		System.out.println(a+" "+abc);
	}
	String write() {
		return "Done";
	}
	int sum()
	{
		int c = 20+30;
		return c;
	}
	public static void main(String[] args) {
		Core2 tree = new Core2();
		tree.speak();
		tree.write();
		String n = tree.write();
		System.out.println(n);
		int c = tree.sum();
		System.out.println(c);
		

	}

}
