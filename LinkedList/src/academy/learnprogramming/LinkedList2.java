package academy.learnprogramming;

import java.util.Iterator;
import java.util.*;
import java.util.LinkedList;

public class LinkedList2 {

    public static void main(String[] args) {

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");

        Iterator<String> itr=al.iterator();
        System.out.println(itr.next());
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}

