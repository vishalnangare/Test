package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateCheck {
    public static void main(String[] args) {

        String str="Hello";

        HashSet<Character>seen= new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=str.length()-1;i++)
        {
            char currentChar=str.charAt(i);
            if(!seen.contains(currentChar))
            {
                seen.add(currentChar);
                sb.append(currentChar);

            }else {
                System.out.println(currentChar);
            }
        }
        System.out.println(sb);



    }
}
