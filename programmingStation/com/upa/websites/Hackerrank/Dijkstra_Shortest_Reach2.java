package com.upa.websites.Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Dijkstra_Shortest_Reach2 {

	static BufferedReader br;
	static PrintWriter pr;
	static StringTokenizer st;

	public static void main (String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pr = new PrintWriter(new OutputStreamWriter(System.out));

		int t = readInt();
		
		for (int qq = 0; qq < t; qq++) {
			int n = readInt();
			int m = readInt();
			// Creating adjecency list here 
			ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
			// Distance array 
			int[] dist = new int[n];
			// Filling maximum value in the distance array and also creating adjecency list
			for (int i = 0; i < n; i++) {
				adj.add(new ArrayList<Edge>());
				dist[i] = 1 << 29;
			}
			// Now we are adding all the data given into the adjecency list 
			// Data like source vertex , destination vertext , coast of that vertext
			for (int i = 0; i < m; i++) {
				int a = readInt() - 1;
				int b = readInt() - 1;
				int c = readInt();
				adj.get(a).add(new Edge(b, c));

				// This is because the graph is not directed graph 
				// Otherwise we will not perform next line
				
				adj.get(b).add(new Edge(a, c));
			}
			// Reading the source here 
			int s = readInt() - 1;
			// Creating priority queue here for selecting proper vertext ar time
			PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();
			
			// Put source as a first zero
			
			dist[s] = 0;
			// Now add first vertext to the priority quque 
			
			q.offer(new Vertex(s, 0));
			
			// Main logic here
			
			while (!q.isEmpty()) {
				// First pop up first element of queue
				Vertex curr = q.poll();
				
				// Now check all the adjecent vertices of the curr
				
				for (Edge next : adj.get(curr.index)) {
					/* Adjecent is stored in next 
					*	now if cost of reaching that vertex is greater that the vertext
					*  which can reach from the current vertex then 
					*  update that cost with the given vertex 
					*  now add this vertex which this new coast into the queue
					*/
					if (dist[next.dest] > curr.cost + next.cost) {
						dist[next.dest] = curr.cost + next.cost;
						q.offer(new Vertex(next.dest, dist[next.dest]));
					}
				}
			}
			
			for (int i = 0; i < n; i++) {
				if (i == s)
					continue;
				System.out.print(dist[i] == 1 << 29 ? "-1 " : dist[i] + " ");
			}
			System.out.println();
		}

		pr.close();
	}

	static class Edge {
		int dest, cost;

		Edge (int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}

	static class Vertex implements Comparable<Vertex> {
		int index, cost;

		Vertex (int index, int cost) {
			this.index = index;
			this.cost = cost;
		}

		@Override
		public int compareTo (Vertex o) {
			return cost - o.cost;
		}
	}

	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong () throws IOException {
		return Long.parseLong(next());
	}

	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter () throws IOException {
		return next().charAt(0);
	}

	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
