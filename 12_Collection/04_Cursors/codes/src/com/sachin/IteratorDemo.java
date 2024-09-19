package com.sachin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    There are 3 types of cursors available in java :
        1)Iterator : To get cursor we have to use iterator() method (Universal Iterator)
             Methods of Iterator are : hasNext(),next(),remove().
        2)ListIterator : To get cursor we have to use listIterator() method ( We can use this only with List Interface)
             Methods of Iterator are : hasNext(),next(),hasPrevious(),previous(),remove(),set().
        3)Enumeration:
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("Sachin");
        l.add("Rushi");

        //System.out.println(l);

        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
