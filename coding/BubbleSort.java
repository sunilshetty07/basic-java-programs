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
public class BubbleSort {
    
    void bubblesort(int arr[])
    {
        int len=arr.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    void printarray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
    public static void main(String[]args)
    {
        BubbleSort bs=new BubbleSort();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array length is:"+arr.length);
        bs.bubblesort(arr);
        System.out.println("Sorted array is: ");
        bs.printarray(arr);
    }
    
}
