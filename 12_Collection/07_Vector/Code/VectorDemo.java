import java.util.Vector;
/*
  Vector class : implements List,Cloneable,Serialazable,RandomAccess

  Important methods : 
  	1. It will have all methods of List and Collection interface methods
	2. addElement(Object o);
	3. firstElement();
	4. lastElement();
	5. removeElement(Object o);
	6. removeElementAt(index);
	7. removeAllElements();
	8. capacity() -> Default capacity intially : 10

*/
public class VectorDemo{

	public static void main(String[] args){

		Vector<Integer> v = new Vector<>();//initial capacity 10
		
		Vector<Integer> v1 = new Vector<>(6);//intial capacity 6

		v.add(10);
		v.add(1,20);
		v.addElement(30);

		System.out.println(v);//[10,20,30]

		//We can store duplicate values
		v.add(10);

		//we can store multiple null values

		System.out.printn(v.removeElement(10));//Value based

		System.out.println(v.removeElementAt(1));

		System.out.println(v.removeAllElements());//It will remove elements present in vector
	}
}
