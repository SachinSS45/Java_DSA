package com.sachin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.List;

/*
    ListIterator : 1)To get cursor we have to use listIterator() method ( We can use this only with List Interface)
                   2) Methods of Iterator are : hasNext(),next(),hasPrevious(),previous(),remove(),set().

 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add("Sachin");
        l.add("Rushi");

        ListIterator litr = l.listIterator();

        System.out.println("*********Forward**********");
        while(litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println(l);
        System.out.println("**********Backward********");
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
