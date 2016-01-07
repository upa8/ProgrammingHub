package com.upa.codebook.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import com.upa.templates.MyScanner;

/*
 * This program is implementation of BFS and DFS algorithms of graph traversal .
 *
 * BFS part of this program is actually implementation of hackerranck problem .
 * Question : BFS : SHORTEST PATH
 * Link : https://www.hackerrank.com/challenges/bfsshortreach
 */

public class GraphTraversal extends MyScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		GraphTraversal in = new GraphTraversal();
		ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
		// ArrayList<ArrayList<Integer>> adj = new
		// ArrayList<ArrayList<Integer>>();

		// Create a graph using adjacecny list
		// Select the source and then traverse the graph that given source
		int t = in.nextInt();
		while (t > 0) {
			// Now create the graph
			int n = in.nextInt(); // Number of node
			int m = in.nextInt(); // Number of edge

			// Create a distance matrix
			int dist[] = new int[n];
			for (int i = 0; i < n; i++) {
				adj.add(new ArrayList<Edge>());
				// adj.add(new ArrayList<Integer>());
				dist[i] = 1 << 29; // Add infinite values I
			}
			// Now add the edges
			for (int i = 0; i < m; i++) {

				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				int c = 6; // in.nextInt(); Here cost is fix which is six
				// As the graph is NOT a directed graph
				adj.get(a).add(new Edge(b, c));
				adj.get(b).add(new Edge(a, c));
				// adj.get(a).add(b);
				// adj.get(b).add(a);

			}
			// BFS starts here
			// Now select the source
			int source = in.nextInt() - 1;

			// Now put distance from source as zero here
			dist[source] = 0;
			// This is very important data structure for bfs
			// ArrayDeque acts as both Queue and Stack
			Queue<Integer> q = new ArrayDeque<Integer>();

			// Now add source into our ArrayDqueue
			q.offer(source);
			// Now Main BFS algorithm

			while (!q.isEmpty()) {
				// Get the first element in queue
				Integer v = q.poll();
				// Now iterate through all the adjacent vertices of v
				// for ( Integer e : adj.get(v) ) {
				for (Edge e : adj.get(v)) {

					// Now we have e.dest as the next vertex
					// But we should check whether that edge is already visited
					// or not
					if (dist[e.dest] == (1 << 29)) {
						// If it is not visited , then make it visited
						// Here value for visited array we are giving is 6
						// At this line , we are increment the distance of next
						// vertex with the previous
						// vertex
						// If we had the value of weight , then we could have
						// wrote following line
						// dist[e.dist] = dist[v] + e.cost ;
						dist[e.dest] = dist[v] + 6;
						// Now add this vertext into our queue at the end .
						// So that we can traverse from that one again .
						q.offer(e.dest);
					}
				}
			}
			// BFS ends here

			// Now just simply display the distance array
			for (int i = 0; i < n; i++) {
				if (i == source) {
					continue;
				}
				if (dist[i] == (1 << 29)) {
					System.out.print(-1 + " ");
				} else {
					System.out.print(dist[i] + " ");
				}
			}
			System.out.println();
			t--;
		}
	}

	static class Edge {
		int dest, cost;

		Edge(int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}
}
