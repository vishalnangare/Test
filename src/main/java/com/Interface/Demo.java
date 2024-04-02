package com.Interface;

public class Demo implements Interface1{
    @Override
    public void method1(String str) {

    }

    public static void main(String[] args) {
        Interface1 interface1=new Demo();
        interface1.log();
        Interface1.isNull("Hello");
        
    }
}
