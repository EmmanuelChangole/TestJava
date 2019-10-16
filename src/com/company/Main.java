package com.company;
public class Main {



    public static void main(String[] args)
    {
        int [] array={1,2,3,4,5,6,7,8,9,10};
       int start =0;
       int end=array.length-1;

       System.out.println( binarySearch(array,34));

    }

    public static  String  binarySearch(int [] array,int value)
    {
        int start=0;
        int end=array.length;

        while (start<end)
        {
            int midpoint=(start+end)/2;
            if(value==array[midpoint])
            {
                return "The index of the value  is "+ midpoint;
            }
            else if(value<array[midpoint])
            {
                end=midpoint;

            }
             else if(value>array[midpoint])
            {
                start=midpoint+1;

            }


        }

          return "The value not found";

    }
}
