package com.har.binarysearch;
import java.io.*;
import java.util.*;
public class BinarySearch {

    public static  void main(String[] args){


        int[] arr = {3,6,9,12,15};
        int len = arr.length;
        int start=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter key for binary search");
        int key=s.nextInt();
        BinarySearch(arr,start,key,len);
    }

public static void BinarySearch(int[] arr, int start, int key, int length){

        int midValue = (start+length)/2;
        while(start<=length){

            if(arr[midValue]<key){

                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
            if(start>length){

                System.out.println("Element is not found");
            }

}

}

