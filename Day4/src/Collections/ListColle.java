package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListColle {

	public static void main(String[] args) {
		
		
	ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
	list.add("Ravi");//Adding object in arraylist  
	list.add("Vijay");
	list.add("Ravi");
	list.add("Ajay");
	for (Object element : list) {
	    System.out.println(element);
	}
	System.out.println();
	
	//Linked List
	LinkedList <String> al=new LinkedList <String>();
	al.add("Ravi");
	al.add("Vijay");
	al.add("Ravi");
	al.add("Ajay");
	System.out.println(al);
	for(Object elements:al) {
		System.out.println(elements);
	}

	}

}
