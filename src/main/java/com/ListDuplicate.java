package com;

import java.util.*;
import java.util.stream.Collectors;

public class ListDuplicate {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Alice", "Bob", "John", "Alice", "Alice");

        Map<String, Integer> map = new HashMap<>();

           for(String name:names)
           {
               if(map.containsKey(name))
               {
                   System.out.println(map.get(name));
                   map.put(name,map.get(name)+1);

               }
               else {
                   map.put(name,1);
               }
           }
      map.forEach((k,v)->{
          System.out.println("key "+k   +" Value "+v);
      });


    }
}
