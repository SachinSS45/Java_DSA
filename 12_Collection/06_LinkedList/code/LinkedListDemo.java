
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		//To add elements in ll : add() method

		ll.add("Sachin");//0th position
		ll.add("Rushi");
		ll.add(105);
		ll.add(124.7);

		//We can specify index also while adding ele

		//ll.add(5,25);//IndexBoundException

		ll.add(4,25);

		System.out.println(ll);//[Sachin,Rushi,105,124.7]
		
		//we can store duplicate values
		ll.add("Sachin");

		//We can store multiple null values
		ll.add(null);
		ll.add(null);

		System.out.println(ll);//[Sachin,Rushi,105,124.7,25,Sachin,null,nui

		

	}
}

