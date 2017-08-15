package com.upa.websites.hackerrank;

import java.util.ArrayList;
import java.util.PriorityQueue;

import com.upa.templates.MyScanner;

public class Prims_Special_Subtree extends MyScanner {
	public static void main(String[] args) throws Exception {
		Prims_Special_Subtree in = new Prims_Special_Subtree();
		int n = Integer.parseInt(in.nextToken());
		int m = Integer.parseInt(in.nextToken());
		// Creating adjecency list here
		ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
		// Distance array
		int[] dist = new int[n];
		// Filling maximum value in the distance array and also creating
		// adjecency list
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Edge>());
			dist[i] = 1 << 29;
		}
		// Now we are adding all the data given into the adjecency list
		// Data like source vertex , destination vertext , coast of that vertext
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(in.nextToken()) - 1;
			int b = Integer.parseInt(in.nextToken()) - 1;
			int c = Integer.parseInt(in.nextToken());
			adj.get(a).add(new Edge(b, c));
			// This is because the graph is not directed graph
			// Otherwise we will not perform next line
			adj.get(b).add(new Edge(a, c));
		}
		// Reading the source here
		int s = Integer.parseInt(in.nextToken()) - 1;
		// Creating priority queue here for selecting proper vertext ar time
		PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();
		// Put source as a first zero
		dist[s] = 0;
		// Now add first vertext to the priority quque
		q.offer(new Vertex(s, 0));
		// Main logic here
		int sum = 0;
		while (!q.isEmpty()) {
			// First pop up first element of queue
			Vertex curr = q.poll();
			if (dist[curr.index] == 1) {
				continue;
			}
			dist[curr.index] = 1;
			sum += curr.cost;
			// Now check all the adjecent vertices of the curr
			// Prim's Algorithm logic

			for (Edge next : adj.get(curr.index)) {

				if (dist[next.dest] == (1 << 29)) {
					// Main logic
					q.offer(new Vertex(next.dest, next.cost));
				}
			}
		}
		System.out.println(sum);
	}

	static class Edge {
		int dest, cost;

		Edge(int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}

	static class Vertex implements Comparable<Vertex> {
		int index, cost;

		Vertex(int index, int cost) {
			this.index = index;
			this.cost = cost;
		}

		@Override
		public int compareTo(Vertex o) {
			return this.cost - o.cost;
		}
	}
}
