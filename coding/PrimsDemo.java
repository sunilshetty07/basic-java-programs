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
public class PrimsDemo {
    public static void main(String[]args)
    {
        int i,j,k,n,source;
        int w[][]=new int[20][20];
        int visited[]=new int[20];
        int minwt,totalcost=0,ev=0,sv=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no.of nodes");
        n=in.nextInt();
        System.out.println("enter the weight matrix");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                w[i][j]=in.nextInt();
            }
        }
        System.out.println("enter the source vertex to start");
        source=in.nextInt();
        for(i=1;i<=n;i++)
        {
            visited[i]=0;
            
        }
        visited[source]=1;
        for(i=1;i<n;i++)
        {
            minwt=999;
            for(j=1;j<=n;j++)
            {
                if(visited[j]==1)
                {
                    for(k=1;k<=n;k++)
                    {
                        if(visited[k]!=1&&w[j][k]<minwt)
                        {
                            sv=j;
                            ev=k;
                            minwt=w[j][k];
                            
                        }
                            
                    }
                }
            }
            totalcost+=minwt;
            visited[ev]=1;
            System.out.println(sv+" "+"-->"+" "+ev+" "+"cost"+" "+minwt);
        
        }
        System.out.println("the total cost of minimum spanning tree is:"+totalcost);
    }
}
