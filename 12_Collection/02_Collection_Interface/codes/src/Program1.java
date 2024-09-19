import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
    Collection :
        1)It is an interface which is present inside java.util package (1.2 Version)
        2)Syntax :
            public interface Collection<E> extends Iterable<E>{
                //Methods
            }
       3)There is no class present which inherits directly Collection interface

    Important methods of Collection Interface :
       1) public boolean add(Object o);
       2) public boolean addAll(Collection c);
       3) boolean contains(Object o);

 */
public class Program1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Sachin");
        al.add('C');

        System.out.println(al);//[10,Sachin,C]

        ArrayList al2 = new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");

        al.addAll(al2);
        System.out.println(al);

        //check if array contains 200 hundred value
        System.out.println(al.contains(200));//false
        System.out.println(al.contains(10));//true

        //check whether the array is empty or not
        System.out.println(al.isEmpty());//false

        //want to find the size
        System.out.println(al.size());//6

        //want to remove specific obj
        //al.remove(10);//IndexOutOfBoundException
        al.remove(0);//It will remove 10(ArrayList method)
        al.remove("Sachin");

        //want to remove all al2 objects from al
        al.removeAll(al2);
        System.out.println(al);//[C]

        //if want clear all elements from al
        al.clear();
    }
}
