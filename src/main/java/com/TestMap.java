package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestMap {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("uk","usa","INDIA","CANADA","INDIA");


      //  Map<String,Integer> map=list.stream().collect(Collectors.toMap(country->country,country->country.length()));


        Set<String>set=list.stream().collect(Collectors.toSet());

        List<String>filter=list.stream().filter(country->country.startsWith("u")).collect(Collectors.toList());

      List<String>upper=  filter.stream().map(c->c.toUpperCase()).collect(Collectors.toList());

        System.out.println("filter "+filter);
        System.out.println(set);

        System.out.println(upper);
     //   System.out.println(map);
    }
}
