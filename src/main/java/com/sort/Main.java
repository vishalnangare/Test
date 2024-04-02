package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1= new Student();
        s1.setId(10);
        s1.setName("Vishal");

        Student s2=new Student();
        s2.setId(12);
        s2.setName("Akash");


        List<Student> list= new ArrayList<>();
        list.add(s1);
        list.add(s2);

        Collections.sort(list,new NameComaprator());

        list.forEach(System.out::println);

        Collections.sort(list,new IdComparator());
        System.out.println("************************************************************************");
        list.forEach(System.out::println);
    }
}

