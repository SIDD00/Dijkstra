package com.blueink.driver;

import java.util.Scanner;
import com.blueink.utilities.Utils;
public class Dijkstra
{
    public static void main(String args [])
    {
        int n,i,j,inf=999;
        Scanner sr =new Scanner(System.in);
        System.out.println("Enter the no of nodes");
        n=sr.nextInt();
        int [][] graph=new int[n][n];


        int distance[]=new int[n];
        int visited[]=new int [n];
        System.out.println("Enter the graph");
        for(i=0;i<n;i++)
        {
            visited[i]=0;
            for (j = 0; j < n; j++)
            {
                graph[i][j] = sr.nextInt();
                if(graph [i][j]<=0)
                {
                    graph[i][j] = inf;
                }
            }
        }
        for(i=0;i<n;i++){
            Utils.spath(graph, visited, i, n);
            visited=new int[]{0,0,0,0,0};
        }
    }
}
