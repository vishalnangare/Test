package com.Interface;
public interface Interface1 {

    // regular abstract method
    void method1(String str);

    default void log() {
        System.out.println("I1 logging::" );
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }

}
