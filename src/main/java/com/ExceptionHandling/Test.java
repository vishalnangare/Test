package com.ExceptionHandling;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Rajesh");
        employee.setSalary(50000L);

        Employee employee1 = new Employee();
        employee1.setName("Jay");
        employee1.setSalary(40000L);


        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);


       /* Optional<Employee> e1 = Optional.of(list.stream().filter(e -> e.getName().startsWith("J")).
                sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();*/

        //System.out.println(e1);

        //Long salary=list.stream().max((emp3,emp4)->Double.compare(emp3.getSalary(), emp4.getSalary())).get().getSalary();

Optional<Employee> secondHighestSalaryEmployee = list.stream()
              .sorted(Comparator.comparing(Employee::getSalary).reversed())
               .skip(1) // Skip the first employee (highest salary) since we need the second highest
              .findFirst();


        System.out.println(secondHighestSalaryEmployee);
    }
}
