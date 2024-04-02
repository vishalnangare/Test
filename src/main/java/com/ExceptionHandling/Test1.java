package com.ExceptionHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());


        // Create a thread to add elements to the list concurrently
        Thread addThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (synchronizedList) {
                    synchronizedList.add("Element " + i);
                }
            }
        });
        addThread.start();

        // Iterate over the synchronized list
        synchronized (synchronizedList) {
            for (String element : synchronizedList) {
                System.out.println(element);
            }

        }
    }
}
