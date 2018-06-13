package com.blueink.utilities;

public class Utils
{
    public static void spath ( int graph[][], int visited[], int src, int n)
    {
        visited[src] = 1;
        int distance[] = graph[src];
        distance[src]=0;
        int nextNode = 0;
        int inf = 999, i = 0;
        for (int count = 0; count < n; count++) {
            inf = 999;
            for (i = 0; i < 5; i++) {
                if (inf > distance[i] && visited[i] != 1) {
                    inf = distance[i];
                    nextNode = i;
                }
            }
            visited[nextNode] = 1;
            for (i = 0; i < 5; i++) {
                if (visited[i] != 1) {
                    if (inf + graph[i][nextNode] < distance[i]) {
                        distance[i] = inf + graph[i][nextNode];
                    }

                }

            }
        }
        for (i = 0; i < distance.length; i++)
            System.out.print("|" + distance[i]);
        System.out.println();
    }
}
