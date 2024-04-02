package com.java8;

public class MyClass {
    public static void main(String[] args) {

 MyFunInterface myFunInterface=(a,b)->{

     int c=a+b;
     return  c;
 };

        System.out.println(myFunInterface.add(10,50));

    }


}
