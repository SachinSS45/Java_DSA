import java.util.*;
/*
    Generics : 1) It provides type safety, and we can store here only one type of value .
                Syntax : <Type>
                2)By using generic we can provide type safety at compile time only.

 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sachin");
        //list.add(123);//incompatible types: int cannot be converted to java.lang.String

        List anotherList = new ArrayList();//Here type is using Object class so it can store any value

        anotherList.add("Sachin");
        anotherList.add(10);
        anotherList.add(10.5);

        System.out.println(list);//[Sachin]
        System.out.println(anotherList);//[Sachin]

    }
}
