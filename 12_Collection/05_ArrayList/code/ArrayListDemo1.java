import java.util.ArrayList;
public class ArrayListDemo1{

	public static void main(String[] args){

		ArrayList al1 = new ArrayList();//For Empty constructor intial capacity will have 10 elements
		//We can provide capacity also
		ArrayList al2 = new ArrayList(6);//Capacity 6

		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);

		ArrayList al3 = new ArrayList(al1);//3rd constructor 

		//Methods of ArrayList

		//To add elements : add();

		//ArrayList is index based data structure

		al1.add(4,50);//It is better
		System.out.println(al1);//[10,20,30,40,50]
		
		//ArrayList can store hertrogenous data types

		al1.add("Sachin");
		al1.add(12.5);

		//ArrayList can store duplicate elements

		al1.add(10);
		al1.add(20);

		//we can store multiple null values

		al1.add(null);
		al1.add(null);

		//To add all methods of al1 to al2

		al2.addAll(al1);
		System.out.println(al2);//[10,20,30,40,50,Sachin,12.5,10,20,null,null]

		//To remove elements

		al1.remove(2);//It will remove 30
		
		System.out.println(al1);//[10,20,40,50,Sachin,12.5,10,20,null,null);
		
		//To remove all elements from al2 which are present in al1
		al2.removeAll(al1);
		System.out.println(al2);//[30]

		//To remove all elements we can use clear() method

		al2.clear();
		System.out.println(al2);//[]
		
		//To increase the capacity of ArrayList
		System.out.println(al2.ensureCapacity(15));//It will increase the capacity of ArrayList
		
		//To check the weather the element is present or not

		System.out.println(al1.contains(10);

		//To find the size

		System.out.println(al1.size());

		//To get by using index 

		System.out.println(al1.get(3));

		//To set particular index ele

		al1.set(2,100);

		//indexOf(obj)
		
		al1.indexOf("Sachin");
		
		//iterator()
	
		Iterator itr = al1.iterator();

		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
		
	}
}

