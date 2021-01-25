/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

/**
 *
 * @author Sunil Shetty
 */
import java.util.*;
public class BinarySearch {
    int binarysearch(int arr[],int low,int high,int key)
    {
        if(high>=low)
        {
            int mid = (low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                return binarysearch(arr,low,mid-1,key);
            }
            else
            {
                return binarysearch(arr,mid+1,high,key);
            }
            
        }
        return -1;
    }
    
public static void main(String[]args)
{
    Scanner in = new Scanner(System.in);
    BinarySearch bs= new BinarySearch();
    System.out.println("enter the number of elements: ");
    int n=in.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
    }
    System.out.println("Array before swaping: ");
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
    int length=arr.length;
    System.out.println("array length is: "+length);
    System.out.println("Enter the value of key: ");
    int x=in.nextInt();
    int result = bs.binarysearch(arr,0,length-1,x);
    if(result==-1)
    {
        System.out.println("Element not present");
    }
    else
        System.out.println("Element found at index "+result);
}
}
