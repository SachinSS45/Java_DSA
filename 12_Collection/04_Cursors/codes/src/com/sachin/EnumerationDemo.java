package com.sachin;
/*
    Enumeration :1) It is cursor used for only legacy classes(Vector and Stack)
                 2) It can be used for only read purpose
                 3) To get cursor we have to use method : elements()
                 4) Methods of Enumeration : hasMoreElements(),nextElement()
 */
import java.util.Vector;
import java.util.Enumeration;
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add("Sachin");
        v.add(15.3);
        System.out.println(v);

        Enumeration e = v.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
