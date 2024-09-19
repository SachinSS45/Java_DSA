import java.util.LinkedList;
/*
 List Important methods : 
 	1.void addFirst(Object obj);
	2.void addLast(Object obj);
	3.Object getFirst(Object obj);
	4.Object getLast(Object obj);
	5.Object removeFirst();
	6.Object removeFirst();

 Methods Came from Collection interface : 
	7.add(Object o);
	8.addAll(Collection c)
	9.remove(Object o);
	10.removeAll(Collection c)
	11.clear();
	12.boolean contains(Object o);
	13.boolean isEmpty(Collection c);
	14.int size();
	
 Methods Came from List interface : 
	15.add(index,Object o);
	16.addAll(index,Collection c);
	17.remove(index);
	18.Object get(index);
	19.Object set(index,Object o);
	20.int indexOf(Object o);
	21.int lastIndexOf(Object o);
 */
public class LinkedListDemo2{

	public static void main(String[] args){

		//Creation of LinkedList
		LinkedList ll = new LinkedList();

		ll.add("Sachin");
		ll.add("Rushi");
		ll.add(105);
		ll.add(124.7);
		ll.add('c');

		System.out.println(ll);

		ll.addFirst("aaa");
		System.out.println(ll);//[aaa, Sachin, Rushi, 105, 124.7, c]

		ll.addLast(45);
		System.out.println(ll);//[aaa, Sachin, Rushi, 105, 124.7, c, 45]

		System.out.println(ll.getFirst());//aaa
		System.out.println(ll.getLast());//45

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);//[Sachin,Rushi,105,124.7,c]

		System.out.println(ll.get(1));//Rushi

		System.out.println(ll.indexOf('c'));//4

		ll.set(4,'s');
		System.out.println(ll.get(4));//s

		ll.remove(4);
		System.out.println(ll);//[Sachin, Rushi, 105, 124.7

		System.out.println(ll.contains("Rushi"));//true

		System.out.println(ll.isEmpty());//false

		System.out.println(ll.size());//4

		ll.clear();
		System.out.println(ll.isEmpty());//true
		System.out.println(ll);//[]
		
	}
}
