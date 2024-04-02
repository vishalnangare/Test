package com;

public class SecondLargest {

    public static int getSecond(int []arr,int total)
    {
        int temp;

        for(int i=0;i<total;i++)
        {
           for(int j=i+1;j<total;j++)
           {
               if(arr[i]>arr[j])
               {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;

               }
           }
        }
        return arr[total-2];
    }

    public static void main(String[] args) {
        int arr[]={10,20,5,60,25};
        System.out.println(getSecond(arr,arr.length));
    }
}
