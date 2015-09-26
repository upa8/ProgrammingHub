package Hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Important things about this program 
/*
* This program implemets arraydequeue which works as both stack as well as queue . It is 
* faster than stack as well as queue. 
* This program uses adjecency list representation of graph for solving the breadth first search problems 
* 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;
//Important algorithm with efficient approach

public class Breadth_First_Search_Shortest_Reach extends MyScanner {


	public static void main (String[] args) throws Exception {
		
		Breadth_First_Search_Shortest_Reach in = new Breadth_First_Search_Shortest_Reach();
		int t = in.nextInt();
		for (int qq = 0; qq < t; qq++) {
			int n = in.nextInt();
			int m = in.nextInt();
			// Adjecency List Representation of graph 
			ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
			
			int[] dist = new int[n];
			// Creating number of vertices into adjecency list  
			for (int i = 0; i < n; i++) {
				adj.add(new ArrayList<Integer>());
				// Maximum value is given to all the elements of distance array
				dist[i] = 1 << 29;
				System.out.println(dist[i] );
			}
			// this used for adjecency representation of graph 
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				adj.get(a).add(b);
				adj.get(b).add(a);
			}
			//End of adding edges into adjecency list here .
			
			// Get the source 
			int s = in.nextInt() - 1;
			// Create array dequeue for storing the previous results 
			Queue<Integer> q = new ArrayDeque<Integer>();
			// distance of source is zero
			// Now putting distance of source from source as zero
			dist[s] = 0;
			// Source is added into the arraydequeue
			q.offer(s);
			//Now as source is added into arraydequeue , we will find all the adjecent elements of the source 
			while (!q.isEmpty()) {
				// Retrives the head of the ArrayDequeue
				Integer curr = q.poll();
				
				// Now search all the adjecent vertices of the vertex curr
				for (int next : adj.get(curr)) {
					// If there is any vertex . Check whether it is visited or not 
					if (dist[next] == 1 << 29) {
						// If the vertex is not visited then
						// find the distance of previous vertex . 
						// Add 1 to this distance and push that new vertex into dequeue
						dist[next] = dist[curr] + 1;
						q.offer(next);
					}
					
				}
			}
			
			for (int i = 0; i < n; i++) {
				if (i == s)
					continue;
				System.out.print(dist[i] == 1 << 29 ? "-1 " : dist[i] * 6 + " ");
			}
			System.out.println();
		}

	}

}


















///////////////////////////////////////////////////////////////////////////////////////////////
// Single Source Shortest Path Problem hackerrank bfs shortest reach

/*
public class BfsShortestReach {
    static List<Integer>[] adj;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int M = scan.nextInt();

            adj = (List<Integer>[]) new List[N];
            for (int j = 0; j < N; j++) {
                adj[j] = new ArrayList<Integer>(N);
            }

            for (int j = 0; j < M; j++) {
                int u = scan.nextInt();
                int v = scan.nextInt();

                adj[u - 1].add(v - 1);
                adj[v - 1].add(u - 1);
            }
            int source = scan.nextInt();
            shortestPathFrmSrc(adj, source, N);
        }
    }

    public static void shortestPathFrmSrc(List<Integer>[] g, int startnode, int N) {
    	
        int dist[] = new int[N];
        
        HashSet<Integer> S = new HashSet<Integer>();
        
        ArrayList<Integer> Q = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[startnode - 1] = 0;

        for(int i = 0; i < N - 1; i++){
        
        	int u = minDistance(dist, S);

            S.add(u);
            for (int v : adj[u]) {
                if (dist[v] > dist[u] + 6 && dist[u]!= Integer.MAX_VALUE && !S.contains(v))
                    dist[v] = dist[u] + 6;
            }
        }

        for (int i = 0; i < N; i++) {
            if(i == startnode - 1)
                continue;
            if (dist[i] == Integer.MAX_VALUE)
                System.out.print("-1 ");
            else
                System.out.print(dist[i] + " ");
        }

    }

    public static int minDistance(int dist[], HashSet<Integer> S) {
        int min = Integer.MAX_VALUE;
        int min_index = 0;

        for (int v = 0; v < dist.length; v++) {
            if (!S.contains(v) && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }

        return min_index;
    }
}

*/
// Following solved only one test case 
/*
public class BfsShortestReach extends MyScanner {
	public static void main(String args[]) throws Exception{
		BfsShortestReach in = new BfsShortestReach();
		int t = in.nextInt();
		while(t>0){
			int n = Integer.parseInt(in.nextToken());
			int m = Integer.parseInt(in.nextToken());
			Graph graph = new Graph(n);
			while(m>0){
				graph.addEdges(Integer.parseInt(in.nextToken()), Integer.parseInt(in.nextToken()));
				m--;
			}
			int source = in.nextInt();
			graph.bfs(source);
			//graph.remaining(source);
			System.out.println();
			t--;
		}
	}
	
	
	

static class Graph{
	
	private int noOfNodes;
	private int[][] adjMat;
	private int Vertices[];
	private Stack<Integer> st;
	private Queue<Integer> qu;
	private int sum = 0 ;
	private int unit = 6;
    private int Distance[];	
	Graph(int n){
		qu = new LinkedList<Integer>();
		st = new Stack<Integer>();
		this.noOfNodes = n;
		adjMat = new int[n][n];
		Distance = new int[n] ;
		//Arrays.fill(adjMat,0);
		for(int i = 0 ; i < n ; i ++){
			Distance[i] = 0;
			for(int j = 0 ; j< n ; j ++){
				adjMat[i][j] =0;
			}
		}
		Vertices = new int[n];
	//	System.out.println(adjMat[0].length);

	//	System.out.println(Vertices.length);
	}
	public void remaining(int Source) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < noOfNodes ; i++){
			if(i == (Source-1)){
				continue;
			}else{
				if(Distance[i] == 0){
					System.out.print(-1+ " ");
					
					}else{
						System.out.print(Distance[i] + " ");		
				}
				
			}
	
		}
	}
	public void bfs(int i) {
		// TODO Auto-generated method stub
		// add first into queue
		int mat = i;
		qu.add(i);
		//System.out.print("BFS : " + i);
		Vertices[i] = 1;
		Distance[i-1] = 1;
		int v1;
		sum = unit;
		while(!qu.isEmpty()){
			int v = qu.remove();
			
			while((v1 = getAdjUnvisitedVetex(v)) != -1){
				Vertices[v1] = 1;
	//			System.out.print(" " +v1);
				qu.add(v1);
				//System.out.println(sum + " ");
				Distance[v1] = sum ;
		
			}
			sum = sum + unit;
			 
		}
		
		remaining(mat);
		
	}
	private int getAdjUnvisitedVetex(int element) {
		// TODO Auto-generated method stub
		for(int j = 0 ; j < noOfNodes ; j++){
			if(adjMat[element][j] == 1 && Vertices[j] == 0){
				return j;
			}
		}
		return -1;
	}
	public void addEdges(int i, int j) {
		// TODO Auto-generated method stub
		adjMat[i][j] = 1;
		adjMat[j][i] = 1;
	}	
}

}

*/