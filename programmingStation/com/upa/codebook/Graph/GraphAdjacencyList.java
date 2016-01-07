package com.upa.codebook.graph;

import java.util.ArrayList;

import com.upa.templates.MyScanner;

/*
 * This is Adacecny List Representation of Graph Data Structure
 *
 * Author : Pratik Upacharya
 */

public class GraphAdjacencyList extends MyScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		GraphAdjacencyList in = new GraphAdjacencyList();

		ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
		int n, m;
		// N will be number of vertices
		// m will be number of edges
		n = in.nextInt();
		m = in.nextInt();
		// Now create the adj matrix for N vertices
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Edge>());
		}
		// Now add the values into the adjacency list
		// As there are m edges , so loop of m
		for (int i = 0; i < m; i++) {
			// Read input
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			// Cost
			int c = 6;// in.nextInt();
			adj.get(a).add(new Edge(b, c));
			// Comment this if graph is directed graph
			// adj.get(b).add(new Edge(a, c));
		}

		// Now Print the values
		// in.printAdjList(adj, n);

		for (int i = 0; i < n; i++) {
			System.out.print(i + 1);
			for (Edge e : adj.get(i)) {
				System.out.print("->" + (e.dest) + ":" + e.cost);
			}
			System.out.println();
		}
	}

	private void printAdjList(ArrayList<ArrayList<Edge>> adj2, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1);
			for (Edge e : adj2.get(i)) {
				System.out.print("->" + (e.dest) + ":" + e.cost);
			}
			System.out.println();
		}
	}

	// This is Edge Class to store destination and cost value
	static class Edge {
		int cost, dest;

		Edge(int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}
}
