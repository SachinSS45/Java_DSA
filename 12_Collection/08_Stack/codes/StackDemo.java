/*
  Stack : It is leagacy class introduced in java 1.0 version
      
	Syntax : class Stack extends Vector{
			//Constructor
			//methods
		 }
	Stack follow LIFO Approch(Last In First Out).
	Stack is index based data structure
	Important Methods : 
		1)push(Object o);
		2)Object pop();
		3)Object peek();
		4)int search(Object o);
		5)boolean empty();
*/
import java.util.Stack;
public class StackDemo{

	public static void main(String[] args){

		Stack s = new Stack();
		s.push("Sachin");
		s.push("Rushi");
		s.push(100);
		s.push(200);

		System.out.println(s);//[Sachin,Rushi,100,200]

		System.out.println(s.pop());//200
		System.out.println(s);
		System.out.println(s.pop());//100

		System.out.println(s.peek());//Rushi

		int index = s.search("Rushi");//1
		System.out.println(index);//1
		
		int index1 = s.search(234);
		System.out.println(index1);//-1
		System.out.println(s.empty());//false
					     
	}
}
