package Oops;

public class EmployeeInh {
     int id;
     String name;
     StudentInh s;
     
     //parameterized constructor
     String Language;
     
     public EmployeeInh(String Language) {
    	 this.Language=Language;
    	 System.out.println("Programming Language" +" "+ Language);
     }
     
     public EmployeeInh(int id, String name, StudentInh s) {
    	 this.id = id;
    	 this.name = name;
    	 this.s = s;
     } 
     void display() {
    	 System.out.println(id+" "+name);
    	 System.out.println(s.city+" "+s.state+" "+s.area);
     }
	public static void main(String[] args) {
		StudentInh ss = new StudentInh("Kanchipuram", "TamilNadu", "Parkavenue");
		EmployeeInh ee = new EmployeeInh(14, "Kalanidhi", ss);
		ee.display();
		
		//paramterised constructor
		EmployeeInh obj1 = new EmployeeInh("Java");	
		EmployeeInh obj2 = new EmployeeInh("Python");	
		

	} 

}
