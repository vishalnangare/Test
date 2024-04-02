package com;

import java.util.*;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args) {

        Employee e= new Employee(101,"Vishal","Pune",50000L);
        Employee e1= new Employee(102,"Sager","Mumbai",875550L);
        Employee e2= new Employee(103,"Akash","Banglore",70000L);
        Employee e3= new Employee(104,"Viraj","Indore",78000L);

        List<Employee> empList= new ArrayList<>();
        empList.add(e);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        List<String> empNames=empList.stream().map(Employee::getEname).collect(Collectors.toList());

        List<String> filterName=empNames.stream().filter(emp->emp.startsWith("V")).collect(Collectors.toList());

        System.out.println(filterName);

        System.out.println(empNames);

        List<String>sorted=empNames.stream().sorted().collect(Collectors.toList());

        System.out.println(sorted);

        List<String>salaryFilter=empList.stream().filter(emp4->emp4.getSalary()>50000).map(Employee::getEname).collect(Collectors.toList());

        System.out.println("Salary List "+salaryFilter);

        int size=empNames.size();

        int midSize=size/2;

        List<String>uppercase=empNames.subList(0,midSize).stream().map(String::toUpperCase).collect(Collectors.toList());

        List<String> lowerCase=empNames.subList(midSize,size).stream().map(String::toLowerCase).collect(Collectors.toList());

        System.out.println(uppercase  +" LowerCase  "+lowerCase);


        String str="VishalNangare";

        int length=str.length()/2;

        System.out.println(str.substring(0,length).toUpperCase()+"   "+str.substring(length,str.length()).toLowerCase());

         Long MaxSal=empList.stream().max((emp3,emp4)->Double.compare(emp3.getSalary(), emp4.getSalary())).get().getSalary();
        System.out.println(MaxSal);

        Long count=empNames.stream().filter(emp5->((String) emp5).contains("V")).count();

        System.out.println(count);
    }
}

