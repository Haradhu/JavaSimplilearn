package com.har.linear;


import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){

        int[] arr = {15,25,30,45,50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the search number");
        int search = sc.nextInt();
            int result = (int) linearing(arr,search);

            if(result==-1){

                System.out.println("Element not in the array");
            } else {

                System.out.println("Element found at index "+result+" and the search key is "+arr[result]);
            }


        }




public static int linearing(int arr[], int x) {

    int length = arr.length;
    int index=-1;//when element not found it will return as -1
    for (int i = 0; i < length - 1; i++) {

        if (arr[i] == x) {//when key value is used

       index=i;//index

         }
     }

            return index;

   }

}

