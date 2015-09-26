package Testing;

import java.util.*;
import java.io.*;
import java.math.*;

public class Practice extends MyScanner {
	public static void main(String args[])throws Exception{
		Practice in = new Practice();
		int t = in.nextInt();
		while(t>0){
			int n = Integer.parseInt(in.nextToken());
			int m = Integer.parseInt(in.nextToken());
			ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
			//Create distance array 
			int dist[] = new int[n];
			// Now create the arraylist and give values to distance array
			for(int i =0; i<n ; i++){
				adj.add(new ArrayList<Edge>());
				dist[i] = 1 << 29;
			}
			// now add values into the adjececcy list 
			for(int i=0; i < m; i++){
				int a = Integer.parseInt(in.nextToken()) - 1 ;
				int b = Integer.parseInt(in.nextToken()) - 1 ;
				int c = Integer.parseInt(in.nextToken()) ;
				adj.get(a).add(new Edge( b , c));
				adj.get(b).add(new Edge( a , c));
			}
			
			// Create priority queue
			PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();
			
			int s = in.nextInt() -1 ;
			dist[s] = 0;
			q.offer(new Vertex(s,0));
			while(!q.isEmpty()){
				Vertex v = q.poll();
				
				for(Edge next : adj.get(v.index)){
					if(dist[next.dest]  > v.cost + next.cost ){
						dist[next.dest] = v.cost + next.cost;
						q.offer(new Vertex (next.dest , dist[next.dest]) );
					}
				}
				
			}
			for (int i = 0; i < n; i++) {
				if (i == s)
					continue;
				System.out.print(dist[i] == 1 << 29 ? "-1 " : dist[i] + " ");
			}
			System.out.println();
			
			t--;
		}
	}
	
	static class Edge {
		int dest, cost;

		Edge (int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}
	static class Vertex implements Comparable<Vertex>{
		int index, cost;

		Vertex (int index, int cost) {
			this.index = index;
			this.cost = cost;
		}
		@Override
		public int compareTo(Vertex o) {
			// TODO Auto-generated method stub
			return cost - o.cost;
		}
		
	}

}
