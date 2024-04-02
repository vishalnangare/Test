package com.sort;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class LogicalTest {
    public static void main(String[] args) throws FileNotFoundException {
/*
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter The String");
        String input=scanner.nextLine();

       for(int i=input.length()-1;i>=0;i--)
       {
           char a=input.charAt(i);
           System.out.print(a);
       }*/

//How do you swap two numbers without using a third variable in Java?
        /*int a=5;
        int b=20;
        System.out.println("Old Value  a "+a +" b "+b);
        a=a+b;  //10+20 =30
        b=a-b;  //30-20=10
        a=a-b; //30-10=20

        System.out.println("a "+a+"  b "+b);*/

        //prime no
       /* int no=11;
        Boolean flag=Boolean.TRUE;

        if(no==0 ||no==1)
        {
           flag=Boolean.FALSE;
        }
        if(no==2)
        {
            flag=Boolean.TRUE;
        }
        for(int i=2;i<=no/2;i++)
        {
            if(no%i==0)
            {
                flag=Boolean.FALSE;
            }
        }

        System.out.println(no +" is prime "+flag);*/

        //Write a Java program to print a Fibonacci sequence using recursion.

      /*  int no=6;
        int a=0;
        int b=1;
        int c=1;
       for(int i=1;i<=no;i++)
       {
           System.out.print(" "+a);
           a=b;
           b=c;
           c=a+b;

       }*/


        //palindrome string
/*

        String str="SASa";
        StringBuilder sb= new StringBuilder();
        String temp;

        for(int i=str.length()-1;i >=0 ;i--)
        {
            sb.append(str.charAt(i));

        }
        temp= String.valueOf(sb);
        System.out.println(temp);
       if(str.equals(temp))
       {
           System.out.println("String is Palindrome");
       }
       else{
           System.out.println("String is Not Palindrome");
       }
*/

        //factors of given no



        //factorial no

      /*  int no=3;
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;


        }
        System.out.println(fact);*/




       /* try (Scanner scanner = new Scanner(new File("D:\\Request.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

/*
        List<Integer> list= Arrays.asList(10,20,30,10);
        Set<Integer> set=list.stream().collect(Collectors.toSet());

        System.out.println("List ");
        list.forEach(System.out::println);
        System.out.println("set");
        set.forEach(System.out::println);*/


        String str1="Vishalnangare";
        int len=str1.length()/2;

        System.out.println(str1.substring(0,len).toUpperCase() +" " +str1.substring(len).toLowerCase());
    }
}
