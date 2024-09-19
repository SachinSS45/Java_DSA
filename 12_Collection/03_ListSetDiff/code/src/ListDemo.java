import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

/*Difference between List and Set in Collection
    1) List is index based data structure we can add elements basis of index (index starts from 0)
       Set is not index based DS. It stores the data on the basis of hashcode values.
    2) List follows insertion order
    3) List allows us to store duplicate elements
 */

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);//It will add 10 at 0 index
        System.out.println(l.indexOf(10));//0
        l.add(1,20);//It will add 20 at index 1
        System.out.println(l.indexOf(20));//1
        l.add(30);
        l.add(40);

        //List follows insertion order
        System.out.println(l);// 10 20 30 40

        //we can store duplicate values in List
        l.add(10);
        l.add(20);

        //we can store multiple null values inside List
        l.add(null);
        l.add(null);
        System.out.println(l);//[10, 20, 30, 40, 10, 20, null, null]

        //To iterate

        Iterator itr = l.iterator();//it will iterate one by one element
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Object ele : l){
            System.out.println(ele);
        }

        //we can use ListIterator in case of List
        ListIterator litr = l.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

    }
}
