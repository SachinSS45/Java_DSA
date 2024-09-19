import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
/*
   Set :
   1)Set is not index based DS. It stores the data on the basis of hashcode values.
   2)Set doesn't follow insertion order it means the sequence you followed for insertion it will not
     follow while extraction or while printing
   3)Set doesn't allow us to store duplicate values in set
 */
public class SetDemo {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        //s.add(5,500);//CE
        //We can't use index based add in Set it use hashcode to store

        //set doesn't follow insertion order
        System.out.println(s);//[400, 100, 200, 300]
        s.add(400);
        s.add(200);
        System.out.println(s);//[400, 100, 200, 300]

        //In set we can store only one null value it means it doesn't allow us store duplicate null values
        s.add(null);
        s.add(null);
        System.out.println(s);//[400, null, 100, 200, 300]

        //to iterate one by one element from set we can use Iterator

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //we don't have ListIterator for Set





    }
}
