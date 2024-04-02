package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        String s1="hello I am vishal nanagre";
   Student student=new Student();

   student.setAge(22);
   student.setName("Vishal");
   student.setPer(80L);
        Student student1=new Student();

        student1.setAge(22);
        student1.setName("Karan");
        student1.setPer(60L);

        List<Student>list=new ArrayList<>();
        list.add(student);
        list.add(student1);



        List<Student> fiter=list.stream().filter(s->s.getPer()< 70).collect(Collectors.toList());

        String name=list.stream().filter(s2->s2.getPer()>70).map(Student::getName).findAny().get();

        System.out.println(name);

        fiter.forEach(System.out::println);




    }
}
