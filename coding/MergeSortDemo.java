/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAA;

/**
 *
 * @author dell
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class MergeSortDemo {
    static int size;
    public static void main(String[]args)throws IOException
    {
      Scanner in=new Scanner(System.in);
      System.out.println("enter the no.of elements to be started:(>5000):");
      size=in.nextInt();
      int inputArr[]=new int [size];
      genRandomNumbers(inputArr);
      long startTime=System.nanoTime();
      mergesort(inputArr,0,size-1);
      long estimatedTime=System.nanoTime()-startTime;
      PrintWriter outA=new PrintWriter(new File("msort.txt"));
      for(int i=0;i<inputArr.length;i++)
      {
          outA.println(inputArr[i]);
      }
      outA.close();
       System.out.println("the time complexity for best,average and worst case is"+(estimatedTime/1000000.0)+"ms");  
    }
    public static void genRandomNumbers(int inputArr[])throws IOException
    {
        int number,count=0;
        Random rand=new Random();
        PrintWriter out=new PrintWriter(new File("random.txt"));
        while (count<size)
        {
            number=rand.nextInt(size)+1;
            out.println(number);
            out.print("");
            inputArr[count]=number;
            count++;
        }
        out.close();
         System.out.println("the total number generated:"+count);
    }
    public static void merge(int a[],int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int c[]=new int[1000000];
        while(i<=mid&&j<=high)
        {
            if(a[i]<a[j])
            {
                c[k]=a[i];
                k=k+1;
                i=i+1;
            }
            else
            {
                c[k]=a[j];
                j=j+1;
                k=k+1;
            }
        }
        while(i<=mid)
        {
            c[k++]=a[i++];
        }
        while(j<=high)
        {
            c[k++]=a[j++];
        }
        for(i=low;i<=high;i++)
        {
            a[i]=c[i];
        }
    }
    public static void mergesort(int a[],int low,int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
}